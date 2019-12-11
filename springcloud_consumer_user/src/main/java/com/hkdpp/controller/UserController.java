package com.hkdpp.controller;

import com.hkdpp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://127.0.0.1:5002";

    @RequestMapping(value = "/rpc", method = RequestMethod.GET)
    public String testprc() {
        return userService.testRPC();
    }


    @RequestMapping(value = "/rpc1", method = RequestMethod.GET)
    public String testprc1() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/user/rpc1/", String.class);
    }

}
