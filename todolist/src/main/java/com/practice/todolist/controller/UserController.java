package com.practice.todolist.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practice.todolist.exception.CookieException;
import com.practice.todolist.service.UserService;
import com.practice.todolist.util.CookieManager;
import com.practice.todolist.vo.User;

@Controller
@RequestMapping("/user")
public class UserController {
	public static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	HttpServletRequest req;
	@Autowired
	HttpServletResponse res;
	
	@Autowired
	CookieManager cookieManager;
	
	@Autowired
	UserService userService;

	@RequestMapping(value = "/searchUsers", method = RequestMethod.GET)
	@ResponseBody
	public List<User> searchAvailableUsers() throws CookieException {
		String userSeq = cookieManager.getUserSeq(req, res);
		List<User> searchUsersExceptMe = userService.getAllUsersExceptMe(userSeq);
		return searchUsersExceptMe;
	}
	

}
