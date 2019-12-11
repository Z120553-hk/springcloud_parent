package com.hkdpp.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;


@Component // 不要忘记添加，不要忘记添加
public class UserServiceFallbackFactory implements FallbackFactory<UserService>
{
	public UserService create(Throwable throwable)
	{
		return new UserService() {

			public String testRPC() {
				System.out.println("testRPC  FallbackFactory...");
				return "testRPC  FallbackFactory...";
			}
		};
	}
}
