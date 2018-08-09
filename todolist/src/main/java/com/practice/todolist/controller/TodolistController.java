package com.practice.todolist.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.todolist.exception.CookieException;
import com.practice.todolist.service.TodoService;
import com.practice.todolist.util.CookieManager;
import com.practice.todolist.vo.Todo;

@Controller
@RequestMapping(value = "/todolist")
public class TodolistController {
	@Autowired
	TodoService todoService;
	
	@Autowired
	CookieManager cookieManager;
	
	@Autowired
	HttpServletRequest req;
	
	@Autowired
	HttpServletResponse res;
	
	@RequestMapping(value = {"","/"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String mainPage(Model model) throws CookieException{
		String userSeq = cookieManager.getUserSeq(req,res);
		List<Todo> myTodos = todoService.getMyTodoList(userSeq);
		model.addAttribute("todolist", myTodos);
		return "/todolistMain";
	}
	
	@RequestMapping(value="/addTodo", method = RequestMethod.POST)
	public String addTodo(Todo todo) throws CookieException{
		String userSeq = cookieManager.getUserSeq(req,res);
		todo.setRegisteredUserSeq(userSeq);
		todoService.addTodo(todo);	
		return "redirect:/todolist";
	}
	
	
}
