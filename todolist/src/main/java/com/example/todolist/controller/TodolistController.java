package com.example.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/todolist", method = RequestMethod.POST)
public class TodolistController {
	@RequestMapping(value = {"","/"}, method = RequestMethod.GET)
	public String mainPage(){
		return "/todolistMain";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addTodolist(){
		return "yet";
	}
}
