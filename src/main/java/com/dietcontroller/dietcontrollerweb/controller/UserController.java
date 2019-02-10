package com.dietcontroller.dietcontrollerweb.controller;

import com.dietcontroller.dietcontrollerweb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController extends APIBaseController {
    @Autowired
    IUserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public int login(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        int loginResult = 0;
        String message;
        loginResult = userService.login(userName, password);
        switch (loginResult) {
            case -1:
                message = "没有该用户";
                break;
            case 0:
                message = "密码错误";
                break;
            default:
                //登录成功
                HttpSession session = request.getSession();
                session.setAttribute("userId", loginResult);
                message = "登录成功";
                break;
        }
        return loginResult;
    }
}
