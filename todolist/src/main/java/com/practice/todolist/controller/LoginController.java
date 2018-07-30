package com.practice.todolist.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.todolist.constants.Error;
import com.practice.todolist.constants.ResultMessage;
import com.practice.todolist.exception.CookieException;
import com.practice.todolist.service.UserService;
import com.practice.todolist.vo.User;

@Controller
@RequestMapping("")
public class LoginController {
	public static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	HttpServletRequest req;
	@Autowired
	HttpServletResponse res;
	
	@Autowired
	UserService userService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showLoginPage() throws CookieException {
		try {
			if (userService.isAuthenicatedUser(req, res)) {
				return "redirect:/todolist"; // /todolist
			}
		} catch (Exception e) {
			logger.error("LoginController - showLoginPage : " + e.getMessage());
			throw new CookieException(Error.LOGIN_ERROR.toString());
		}
		return "todoLoginPage";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST) //로그인
	public String doLogin(User user, Model model) {
		if (userService.doLogin(user, req, res)) {
			return "redirect:/todolist";
		}

		model.addAttribute("message", ResultMessage.LOGIN_FAIL.toString());
		return "/todoLoginPage";
	}
}
