package com.groupi.boardinghub.controller;

import com.groupi.boardinghub.dto.UserDTO;
import com.groupi.boardinghub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @Autowired
    private UserService userService;
    @GetMapping("/get")
    public String testMethod(){
        return "Hello Kavinga Sir";
    }}
