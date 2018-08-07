package com.practice.todolist.constants;

public enum Error {
	CREATE_COOKIE_ERROR(0, "쿠기생성에 실패했습니다."),
	CHECK_AUTHENICATED_USER_ERROR(1, "사용자 인증에 실패했습니다."),
	LOGIN_ERROR(2, "로그인에 실패했습니다."),
	COOKIE_ERROR(3,"정상적인 방법으로 로그인 해주세요");

	private String description;
	private int code;

	Error(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public int getCode() {
		return code;
	}

	@Override
	public String toString() {
		return code + ": " + description;
	}
}
