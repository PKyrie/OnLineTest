package com.hqyj.controller.main;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hqyj.service.QuestionAnswerService;

@Controller
/*@RequestMapping("/action")*/
public class MainAction {
	@Resource
	private QuestionAnswerService qas;
	
	@RequestMapping("/main")
	public String main(){
		return "main";
	}
	
	@RequestMapping("/list")
	public String list(){
		return "list";
	}
	
	@RequestMapping("/add")
	public String add(){
		return "add";
	}
	
	@RequestMapping("/addmore")
	public String addmore(){
		return "addmore";
	}
	
	@RequestMapping("/cate")
	public String cate(){
		return "cate";
	}
	
	@RequestMapping("/newSingleQuestion")
	public String newSingleQuestion(HttpServletRequest request){
		qas.creatNewQuestion(request);
		return "add";
	}
	
	@RequestMapping("/newMoreQuestion")
	public String newMoreQuestion(HttpServletRequest request){
		qas.creatNewQuestion(request);
		return "addmore";
	}
}
