package com.practice.todolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.todolist.dao.TodoDao;
import com.practice.todolist.vo.Todo;

@Service
public class TodoService {
	@Autowired
	TodoDao todoDao;

	public void addTodo(Todo todo) {
		todoDao.addTodo(todo);
		todoDao.addShareUsers(todo);

	}

	public List<Todo> getMyTodoList(String myId) {
		List<Todo> todos = todoDao.selectByMyTodo(myId);
		return todos;
	}
	
}
