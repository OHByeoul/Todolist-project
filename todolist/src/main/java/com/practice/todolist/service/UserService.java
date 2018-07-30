package com.practice.todolist.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.todolist.dao.UserDao;
import com.practice.todolist.util.CookieManager;
import com.practice.todolist.vo.User;

@Service
public class UserService {
	private final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	UserDao userDao;

	@Autowired
	CookieManager cookieManager;

	public boolean doLogin(User tryLoginUser, HttpServletRequest req, HttpServletResponse res) {
		User calledUser = userDao.selectByUserId(tryLoginUser.getId());
		logger.info("tryloginuser id"+tryLoginUser.getId());
		logger.info("tryloginuser pwd"+tryLoginUser.getPassword());
		logger.info(calledUser.getId());
		logger.info(calledUser.getName());
		logger.info(calledUser.getPassword());
		try {
			if (checkCorrectUser(tryLoginUser, calledUser)) {
				return cookieManager.createCookie(tryLoginUser, res);
			}
		} catch (Exception e) {
			logger.error("UserService - doLogin : "+e.getMessage());
		}
		return false;
	}

	private boolean checkCorrectUser(User tryLoginUser, User calledUser) {
		String tryLoginUserPwd = tryLoginUser.getPassword();
		String calledUserPwd = calledUser.getPassword();
		return tryLoginUserPwd.equals(calledUserPwd);
	}

	public boolean isAuthenicatedUser(HttpServletRequest req, HttpServletResponse res) {
		try {
			boolean checkAuthenicatedUser = cookieManager.isAuthenicatedUser(req, res);
			return checkAuthenicatedUser;
		} catch (Exception e) {
			logger.error("UserSercie - isAuthenicatedUser : "+e.getMessage());
		}
		return false;
	}
}
