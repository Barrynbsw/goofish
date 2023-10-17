package com.example.springgf.controller;

import com.example.springgf.common.result;
import com.example.springgf.entity.users;
import com.example.springgf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/login")
    public result login(HttpSession r, @RequestBody users user){

        return null;
    }
}
