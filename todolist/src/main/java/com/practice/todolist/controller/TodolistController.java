package com.practice.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.todolist.service.TodoService;
import com.practice.todolist.vo.Todo;

@Controller
@RequestMapping(value = "/todolist")
public class TodolistController {
	@Autowired
	TodoService todoService;
	
	@RequestMapping(value = {"","/"}, method = RequestMethod.GET)
	public String mainPage(String myId,Model model){
		List<Todo> myTodos = todoService.getMyTodoList(myId);
		model.addAttribute("todolist", myTodos);
		return "/todolistMain";
	}
	
	@RequestMapping(value="/addTodo", method = RequestMethod.POST)
	public String addTodo(Todo todo){
		todoService.addTodo(todo);
		
		return "/todolistMain";
	}
	
	
}
