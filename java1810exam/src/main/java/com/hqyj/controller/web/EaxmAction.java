package com.hqyj.controller.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqyj.service.QuestionAnswerService;

@Controller
public class EaxmAction {
	@Resource
	private QuestionAnswerService qas;
	@RequestMapping(value="/getTestPaper",produces="text/html;charset=UTF-8")
	public @ResponseBody String getTestPaper() {
		return qas.getQuestionsByJson();
	}
}
