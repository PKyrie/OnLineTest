package com.hqyj.dao;

import java.util.List;

import com.hqyj.pojo.ExamQuestion;
import com.hqyj.pojo.QuestionAndOptions;

public interface ExamQuestionDao {
	int insert(ExamQuestion e);
	
	//查询所有的问题和选项
	List<QuestionAndOptions> selectAllQuestionAndOptions(int type);
	
}
