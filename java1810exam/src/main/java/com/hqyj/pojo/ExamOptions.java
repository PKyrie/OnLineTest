package com.hqyj.pojo;

public class ExamOptions {
	private int optionId;
	private String optionDesc;// 选项描述
	private String optionFlag;// 选项标识
	private int titleId;// 题目外键
	public int getOptionId() {
		return optionId;
	}
	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}
	public String getOptionDesc() {
		return optionDesc;
	}
	public void setOptionDesc(String optionDesc) {
		this.optionDesc = optionDesc;
	}
	public String getOptionFlag() {
		return optionFlag;
	}
	public void setOptionFlag(String optionFlag) {
		this.optionFlag = optionFlag;
	}
	public int getTitleId() {
		return titleId;
	}
	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}
	public ExamOptions() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ExamOptions [optionId=" + optionId + ", optionDesc=" + optionDesc + ", optionFlag=" + optionFlag
				+ ", titleId=" + titleId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((optionDesc == null) ? 0 : optionDesc.hashCode());
		result = prime * result + ((optionFlag == null) ? 0 : optionFlag.hashCode());
		result = prime * result + optionId;
		result = prime * result + titleId;
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
		ExamOptions other = (ExamOptions) obj;
		if (optionDesc == null) {
			if (other.optionDesc != null)
				return false;
		} else if (!optionDesc.equals(other.optionDesc))
			return false;
		if (optionFlag == null) {
			if (other.optionFlag != null)
				return false;
		} else if (!optionFlag.equals(other.optionFlag))
			return false;
		if (optionId != other.optionId)
			return false;
		if (titleId != other.titleId)
			return false;
		return true;
	}
	
}
