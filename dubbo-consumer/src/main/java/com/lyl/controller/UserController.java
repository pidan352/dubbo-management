package com.lyl.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lyl.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：
 *
 * @author 林亦亮
 * @version 1.0
 * @date 2022/12/4
 */

@RestController
public class UserController {

	@Reference
	private UserService userService;

	@GetMapping("/getHello/{name}")
	public String getHello(@PathVariable String name) {
		return userService.getHello(name);
	}
}
