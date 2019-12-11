package com.hkdpp.controller;

import com.hkdpp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/rpc", method = RequestMethod.GET)
    public String testprc() {
        return userService.testRPC();
    }


    @RequestMapping(value = "/rpc1", method = RequestMethod.GET)
    public String testprc1() {
        return userService.testRPC();
    }

}