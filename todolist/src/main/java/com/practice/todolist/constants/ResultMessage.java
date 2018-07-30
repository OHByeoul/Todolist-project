package com.practice.todolist.constants;

public enum ResultMessage {
	LOGIN_FAIL(0, "로그인에 실패했습니다.");
	
	private int code;
	private String message;
	

	private ResultMessage(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}

	public String toString(){
		return code + " : " + message;
	}
	
}
