package com.hkdpp.service;

import org.springframework.cloud.netflix.feign.FeignClient;


public interface UserService {

    String testRPC();
}
