package com.ssafy.mvc.model.dto;

public class Board {
	private String title;
	private String content;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(String title, String content) {
		super();
		this.title = title;
		this.content = content;
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

	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + "]";
	}
	
	
}
