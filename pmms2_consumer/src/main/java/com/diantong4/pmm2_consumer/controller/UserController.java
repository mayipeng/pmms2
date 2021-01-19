package com.diantong4.pmm2_consumer.controller;

import com.diantong4.entity.User;
import com.diantong4.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/getAllUser")
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }
    @RequestMapping("/getUser")
    public String getUsers() {
        return userService.getName();
    }
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
