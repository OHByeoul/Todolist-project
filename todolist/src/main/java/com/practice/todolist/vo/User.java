package com.practice.todolist.vo;

public class User {
	private int userSeq;
	private String id;
	private String password;
	private String name;

	//private String myTodoSeq;
	
	public User() {
	}
	
	public User(int userSeq,String id,String password, String name) {
		this.userSeq = userSeq;
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public String getMyTodoSeq() {
//		return myTodoSeq;
//	}
//
//	public void setMyTodoSeq(String myTodoSeq) {
//		this.myTodoSeq = myTodoSeq;
//	}
//	
	
}
