package com.practice.todolist.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.practice.todolist.vo.Todo;

@Mapper
public interface TodoDao {

	void addTodo(Todo todo);

	List<Todo> selectByMyTodo(String myId);

	void addShareUsers(Todo todo); 

	
}
