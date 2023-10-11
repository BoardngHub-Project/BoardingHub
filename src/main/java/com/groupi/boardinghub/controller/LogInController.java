package com.groupi.boardinghub.controller;

import com.groupi.boardinghub.dto.LogInDTO;
import com.groupi.boardinghub.dto.UserDTO;
import com.groupi.boardinghub.model.User;
import com.groupi.boardinghub.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
public class LogInController {

    @PostMapping
    public String logIn(@RequestBody LogInDTO loginDto){

        User user= UserService.findByEmail(loginDto.getEmail());
        if(user==null){
            return "Account not found";
        }else if(user.getPassword().equals(loginDto.getPassword())) {
            return "Logged in Successfully!...";
        }else{
            return "Incorrect Credentials...";
        }
    }



}
