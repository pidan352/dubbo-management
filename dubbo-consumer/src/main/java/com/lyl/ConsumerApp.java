package com.lyl;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 功能：
 *
 * @author 林亦亮
 * @version 1.0
 * @date 2022/12/4
 */

@SpringBootApplication
public class ConsumerApp {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConsumerApp.class).web(WebApplicationType.NONE).run(args);
	}
}
