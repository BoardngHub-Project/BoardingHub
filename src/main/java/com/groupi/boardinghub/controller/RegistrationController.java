package com.groupi.boardinghub.controller;

import com.groupi.boardinghub.dto.UserDTO;
import com.groupi.boardinghub.model.User;
import com.groupi.boardinghub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/register")
public class RegistrationController {
    @Autowired
    private  UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/account")
    public ResponseEntity<String> createAccount(@RequestBody UserDTO userDto){

        //check weather email is valid or not


        //if()

        //checking the email is already exists
        if(userRepository.existsByEmail(userDto.getEmail())){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Email is already taken.");
        }

        //checking weather password and confirm password
        if(!userDto.getPassword().equals(userDto.getConfirmPassword())){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Confirm Password does not match");
        }


        //mapping the UserDto input into User entity
        User user=new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));


        // save the data into db
        userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("User register successfully");
    }

    @PutMapping("/account/{email}")
    public ResponseEntity<String> updateUser(@PathVariable String email, @RequestBody UserDTO updatedUserDto) {
        Optional<User> optionalUser = Optional.ofNullable(userRepository.findByEmail(email));

        if (optionalUser.isPresent()) {
            User existingUser = optionalUser.get();

            // Update the fields you want to allow modify
            existingUser.setFirstName(updatedUserDto.getFirstName());
            existingUser.setLastName(updatedUserDto.getLastName());
            existingUser.setEmail(updatedUserDto.getEmail());


            userRepository.save(existingUser);
            return ResponseEntity.status(HttpStatus.OK)
                    .body("User details updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("User not found");
        }
    }
}
