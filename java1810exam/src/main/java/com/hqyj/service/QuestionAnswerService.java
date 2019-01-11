package com.hqyj.service;

import javax.servlet.http.HttpServletRequest;


public interface QuestionAnswerService {
	void creatNewQuestion(HttpServletRequest request);
	
	String getQuestionsByJson();
}
