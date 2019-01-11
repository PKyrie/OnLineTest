package com.hqyj.pojo;

public class ExamQuestion {
	private int titleId;
	private String titleName;//题目名称
	private int titleScore;// 题目分值
	private int type;// 题目类型0:单选题  1多选题
	public int getTitleId() {
		return titleId;
	}
	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public int getTitleScore() {
		return titleScore;
	}
	public void setTitleScore(int titleScore) {
		this.titleScore = titleScore;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public ExamQuestion() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ExamQuestion [titleId=" + titleId + ", titleName=" + titleName + ", titleScore=" + titleScore
				+ ", type=" + type + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + titleId;
		result = prime * result + ((titleName == null) ? 0 : titleName.hashCode());
		result = prime * result + titleScore;
		result = prime * result + type;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExamQuestion other = (ExamQuestion) obj;
		if (titleId != other.titleId)
			return false;
		if (titleName == null) {
			if (other.titleName != null)
				return false;
		} else if (!titleName.equals(other.titleName))
			return false;
		if (titleScore != other.titleScore)
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
}
