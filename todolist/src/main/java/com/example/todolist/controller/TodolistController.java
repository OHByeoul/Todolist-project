package com.example.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/todolist", method = RequestMethod.GET)
public class TodolistController {
	@RequestMapping(value = {"","/"}, method = RequestMethod.GET)
	public String mainPage(){
		return "/todolistMain";
	}
	
	@GetMapping(value = "gg")
	public String a(){
		return "";
	}
}
