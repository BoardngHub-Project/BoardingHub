package com.groupi.boardinghub.service;

import com.groupi.boardinghub.dto.LogInDTO;
import com.groupi.boardinghub.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class LoginService {

    @Autowired
    private PasswordEncoder passwordEncoder; //BCryptPasswordEncoder
    public String logIn(@RequestBody LogInDTO loginDto){

        User user= UserService.findByEmail(loginDto.getEmail());
        if(user==null){
            return "Account not found";
        }else if(passwordEncoder.matches(loginDto.getPassword(),user.getPassword())) {
            return "Logged in Successfully!...";
        }else{
            return "Incorrect Credentials...";
        }
    }
}
