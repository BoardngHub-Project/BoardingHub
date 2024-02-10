package com.groupi.boardinghub.controller;

import com.groupi.boardinghub.dto.LogInDTO;
import com.groupi.boardinghub.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
//@RequestMapping("/api/login")
public class LogInController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/api/login")
    public String logInFunction(@RequestBody LogInDTO loginDto){
        String loginStatus = loginService.logIn(loginDto);
        return loginStatus;
    }



}
