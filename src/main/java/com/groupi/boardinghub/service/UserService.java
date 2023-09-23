package com.groupi.boardinghub.service;

import com.groupi.boardinghub.dto.UserDTO;
import com.groupi.boardinghub.model.User;
import com.groupi.boardinghub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public String addUser(UserDTO userDto){
        User user=new User("",userDto.getFirstName(),userDto.getLastName(),userDto.getEmail(),userDto.getPassword());
        userRepository.save(user);
        return "Successfully Saved";
    }

}
