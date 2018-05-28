package com.cdinit.controller;

import com.cdinit.po.UserEntity;
import com.cdinit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Author: sun_chuan
 * Date: 2018/5/28
 * Time: 16:10
 * Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public List<UserEntity> getAllUsers(){
        List<UserEntity> list = userService.getAllUsers();
        return list;
    }
}