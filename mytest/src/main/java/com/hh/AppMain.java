package com.hh;

import com.hh.config.AppConfig;
import com.hh.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author huhuan
 * @Description
 * @Date 13:04 2020/6/2
 **/
public class AppMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService us = context.getBean(UserService.class);
		System.out.println(us);
	}
}
