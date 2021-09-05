package com.clearsky.ssm.controller;

import com.clearsky.ssm.pojo.User;
import com.clearsky.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    private UserService userService;
    @RequestMapping("/index")
    @ResponseBody
    public List<User> find(){
        return userService.findAll();
    }
    @RequestMapping("/")
    public String find1(){
        return "index";
    }

}
