package com.practice.todolist.dao;

import org.apache.ibatis.annotations.Mapper;

import com.practice.todolist.vo.User;

@Mapper
public interface UserDao {
	User selectByUserId(String userId);
}
