package com.lyl.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lyl.service.UserService;

/**
 * 功能：
 *
 * @author 林亦亮
 * @version 1.0
 * @date 2022/12/4
 */

@Service   //注意是alibaba.dubbo的service，相当于@Webservice，表示对外提供服务的接口
public class UserServiceImpl implements UserService {
	@Override
	public String getHello(String name) {
		return "hi," + name;
	}
}
