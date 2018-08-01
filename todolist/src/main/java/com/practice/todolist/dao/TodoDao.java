package com.practice.todolist.dao;

import org.apache.ibatis.annotations.Mapper;

import com.practice.todolist.vo.Todo;

@Mapper
public interface TodoDao {

	void addTodo(Todo todo);
	
}
