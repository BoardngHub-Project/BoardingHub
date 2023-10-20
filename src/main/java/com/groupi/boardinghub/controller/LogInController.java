package com.groupi.boardinghub.controller;

import com.groupi.boardinghub.dto.LogInDTO;
import com.groupi.boardinghub.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
public class LogInController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public String logInFunction(@RequestBody LogInDTO loginDto){
        String loginStatus= loginService.logIn(loginDto);
        return loginStatus;
    }



}
