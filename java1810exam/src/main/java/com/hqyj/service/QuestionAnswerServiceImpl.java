package com.hqyj.service;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.hqyj.dao.ExamOptionsDao;
import com.hqyj.dao.ExamQuestionDao;
import com.hqyj.dao.QuestionAnswerDao;
import com.hqyj.pojo.ExamOptions;
import com.hqyj.pojo.ExamQuestion;
import com.hqyj.pojo.QuestionAndOptions;
import com.hqyj.pojo.QuestionAnswer;
@Service
public class QuestionAnswerServiceImpl implements QuestionAnswerService {
	@Resource
	private ExamQuestionDao eqd;
	@Resource
	private ExamOptionsDao eod;
	@Resource
	private QuestionAnswerDao qad;
	@Resource
	private Gson g;
	
	//事务处理
	@Transactional(rollbackFor=Exception.class)
	@Override
	public void creatNewQuestion(HttpServletRequest request) {
		//从前端拿到题干
		ExamQuestion examQuestion = new ExamQuestion();
		examQuestion.setTitleName(request.getParameter("stemContent"));
		examQuestion.setTitleScore(Integer.parseInt(request.getParameter("score")));
		examQuestion.setType(0);
		eqd.insert(examQuestion);
		//得到生成的题干ID
		int id = examQuestion.getTitleId();
		//从前端得到选项
		String[] opt = request.getParameterValues("options");
		for (int i = 0; i < opt.length; i++) {
			ExamOptions eo = new ExamOptions();
			eo.setTitleId(id);
			eo.setOptionDesc(opt[i]);
			eo.setOptionFlag(String.valueOf((char)(65+i)));
			eod.insert(eo);
		}
		//从前端得到答案
		QuestionAnswer questionAnswer = new QuestionAnswer();
		questionAnswer.setRightAnswer(String.valueOf((char)(65+Integer.parseInt(request.getParameter("answerIndex")))));
		questionAnswer.setTitleId(id);
		qad.insert(questionAnswer);
		/*if (examQuestion.getType()==0) {
			eqd.insert(examQuestion);
			int id = examQuestion.getTitleId();
			String[] opt = request.getParameterValues("options");
			for (int i = 0; i < opt.length; i++) {
				ExamOptions eo = new ExamOptions();
				eo.setTitleId(id);
				eo.setOptionDesc(opt[i]);
				eo.setOptionFlag(String.valueOf((char)(65+i)));
				eod.insert(eo);
			}
			QuestionAnswer questionAnswer = new QuestionAnswer();
			questionAnswer.setRightAnswer(String.valueOf((char)(65+Integer.parseInt(request.getParameter("answerIndex")))));
			questionAnswer.setTitleId(id);
			qad.insert(questionAnswer);
		}else {
			eqd.insert(examQuestion);
			int id = examQuestion.getTitleId();
			String[] opt = request.getParameterValues("options");
			for (int i = 0; i < opt.length; i++) {
				ExamOptions eo = new ExamOptions();
				eo.setTitleId(id);
				eo.setOptionDesc(opt[i]);
				eo.setOptionFlag(String.valueOf((char)(65+i)));
				eod.insert(eo);
			}
			QuestionAnswer questionAnswer = new QuestionAnswer();
			questionAnswer.setRightAnswer(String.valueOf((char)(65+Integer.parseInt(request.getParameter("answer")))));
			questionAnswer.setTitleId(id);
		}
		*/
	}
	//获取全部单选试题并转化为JSON字符串
	@Override
	public String getQuestionsByJson() {
		//查询出所有单选试题（type=0），将其包装成为一个新对象，其中包含试题题干原有属性和其全部选项
		List<QuestionAndOptions> sqa = eqd.selectAllQuestionAndOptions(0);
		return g.toJson(sqa);
	}

}
