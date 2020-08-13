package com.weeeloop.dto;

public class OptionDTO {
	
	private long id;

	private String value;

	private boolean isMarked;

	private long question_id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isMarked() {
		return isMarked;
	}

	public void setMarked(boolean isMarked) {
		this.isMarked = isMarked;
	}

	public long getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(long l) {
		this.question_id = l;
	}
	
}
