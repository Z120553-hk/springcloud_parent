package com.hkdpp.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "provider-user",fallbackFactory=UserServiceFallbackFactory.class)
public interface UserService {
    @RequestMapping(value = "/user/rpc", method = RequestMethod.GET)
    String testRPC();
}
