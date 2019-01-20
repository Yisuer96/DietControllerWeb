package com.dietcontroller.dietcontrollerweb.controller;

import com.dietcontroller.dietcontrollerweb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    IUserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public int login(@RequestParam("userName")String userName,@RequestParam("password")String password){
        return 0;
    }
}
