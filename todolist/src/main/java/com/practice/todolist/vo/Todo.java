package com.practice.todolist.vo;

public class Todo {
	private String todoSeq;
	private String title;
	private String content;
	private String startDate;
	private String endDate;
	private String important;
	private String complete;
	
	private String registeredUserSeq;

	public String getRegisteredUserSeq() {
		return registeredUserSeq;
	}

	public void setRegisteredUserSeq(String registeredUserSeq) {
		this.registeredUserSeq = registeredUserSeq;
	}

	public String getTodoSeq() {
		return todoSeq;
	}

	public void setTodoSeq(String todoSeq) {
		this.todoSeq = todoSeq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String start_date) {
		this.startDate = start_date;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String end_date) {
		this.endDate = end_date;
	}

	public String getImportant() {
		return important;
	}

	public void setImportant(String important) {
		this.important = important;
	}

	public String getComplete() {
		return complete;
	}

	public void setComplete(String complete) {
		this.complete = complete;
	}
}
