package com.weeeloop.model;

import java.util.List;

import com.weeeloop.dto.QuestionDto;

public class Assessment {

	private List<QuestionDto> questions;

	public List<QuestionDto> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionDto> questions) {
		this.questions = questions;
	}
	
}

