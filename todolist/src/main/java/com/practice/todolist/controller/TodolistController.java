package com.practice.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/todolist")
public class TodolistController {
	@RequestMapping(value = {"","/"}, method = RequestMethod.GET)
	public String mainPage(){
		return "/todolistMain";
	}
	
	@RequestMapping(value="/addList", method = RequestMethod.POST)
	public String addTodolist(){
		return "/todolistMain";
	}
	
	
}
