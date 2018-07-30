package com.practice.todolist.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.practice.todolist.constants.Constants;
import com.practice.todolist.constants.Error;
import com.practice.todolist.controller.TodolistController;
import com.practice.todolist.exception.CookieException;
import com.practice.todolist.vo.User;

@Component
public class CookieManager {

	private static final Logger logger = LoggerFactory.getLogger(TodolistController.class);
	private static final String AUTH_KEY = Constants.AUTH_COOKIE_KEY;

	public boolean createCookie(User validUser, HttpServletResponse res) throws CookieException {
		try {
			Cookie cookie = new Cookie(AUTH_KEY, validUser.getId());
			cookie.setMaxAge(60 * 60);
			cookie.setPath("/");
			res.addCookie(cookie);
			return true;

		} catch (Exception e) {
			logger.error("CookieManager - createCookie : " + e.getMessage());
			throw new CookieException(Error.CREATE_COOKIE_ERROR.toString());
		}
	}

	public void deleteCookie(HttpServletResponse res) {
		Cookie cookie = new Cookie(AUTH_KEY, null);
		cookie.setMaxAge(0);
		cookie.setPath("/");
		res.addCookie(cookie);
	}

	public boolean isAuthenicatedUser(HttpServletRequest req, HttpServletResponse res) throws CookieException {
		try {
			if (req.getCookies() != null) {
				Cookie[] cookies = req.getCookies();

				for (Cookie cookie : cookies) {
					boolean hasAuthenicatedKey = cookie.getName().equals(AUTH_KEY);
					if (hasAuthenicatedKey) {
						cookie.setMaxAge(60 * 60); // 시간 연장
						return true;
					}
				}
			}
		} catch (Exception e) {
			logger.error("CookieManager - isAutenicatedUser : " + e.getMessage());
			deleteCookie(res);
			throw new CookieException(Error.CHECK_AUTHENICATED_USER_ERROR.toString());
		}
		return false;
	}

	// public boolean checkAuthenicated(HttpServletRequest req,
	// HttpServletResponse res) {
	// // TODO Auto-generated method stub
	// return false;
	// }

}
