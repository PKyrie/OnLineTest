package com.hqyj.pojo;

import java.util.List;

public class QuestionAndOptions extends ExamQuestion{
	private List<ExamOptions> options;

	public List<ExamOptions> getOptions() {
		return options;
	}

	public void setOptions(List<ExamOptions> options) {
		this.options = options;
	}
	
}
