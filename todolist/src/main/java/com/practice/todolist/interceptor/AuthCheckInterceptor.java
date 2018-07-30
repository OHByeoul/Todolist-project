package com.practice.todolist.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.practice.todolist.annotation.AuthCheck;
import com.practice.todolist.util.CookieManager;

public class AuthCheckInterceptor implements HandlerInterceptor {

	private CookieManager cookieManager;
	
	public AuthCheckInterceptor(CookieManager cookieManager) {
		this.cookieManager = cookieManager;
	}
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
		if(!(handler instanceof HandlerMethod)){
			return true;
		}
		
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		AuthCheck authCheck = handlerMethod.getMethodAnnotation(AuthCheck.class);
		if(authCheck == null){
			return true;
		}
		
//		boolean isAuthenicated = cookieManager.checkAuthenicated(req,res);
//		if(isAuthenicated){
//			return true;
//		}
//		
		res.sendRedirect("/");
		return false;
	}
		
}
