package com.practice.todolist.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.practice.todolist.vo.Todo;

@Mapper
public interface TodoDao {

	void addTodo(Todo todo);

	List<Todo> selectByMyId(String myId); 
	// 로딩 후 내 id로 등록한 todo를 모두 불러온다
	
}
