package com.example.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/todolist", method = RequestMethod.GET)
public class TodolistController {
	@RequestMapping(value = "/hello")
	@ResponseBody
	public String hello(){
		return "running test";
	}
}
