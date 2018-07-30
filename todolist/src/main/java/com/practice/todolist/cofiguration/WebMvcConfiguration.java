package com.practice.todolist.cofiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.practice.todolist.interceptor.AuthCheckInterceptor;
import com.practice.todolist.util.CookieManager;


public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

	@Autowired
	CookieManager cookieManager;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new AuthCheckInterceptor(cookieManager));
	}
}
