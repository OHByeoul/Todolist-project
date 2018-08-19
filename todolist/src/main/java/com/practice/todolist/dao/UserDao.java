package com.practice.todolist.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.practice.todolist.vo.User;

@Mapper
public interface UserDao {
	User selectByUserId(String userId);

	List<User> selectByUserExceptMe(String userSeq);
}
