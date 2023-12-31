package com.example.springgf.controller;


import com.example.springgf.common.result;
import com.example.springgf.entity.users;
import com.example.springgf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/login")
    public result login(HttpServletRequest r, users user){//@requestbody
        users u=userService.login(user);
        if(user==null)
            return result.error();
        else if(!u.getPassword().equals(user.getPassword()))
         return result.error();
      else r.getSession().setAttribute("users",u.getUserID());
         return result.success(u);
    }
    @GetMapping("test")
    public result test(){
        return userService.test();
    }
    @PostMapping("logout")
    public result logout(HttpServletRequest r){
        r.getSession().removeAttribute("users");
        return result.success();
    }}
