package com.hkdpp.service.impl;

import com.hkdpp.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public String testRPC() {
        int i = 1/0;
        return "testRPC is running...";
    }
}
