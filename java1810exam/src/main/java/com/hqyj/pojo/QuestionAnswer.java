package com.hqyj.pojo;

public class QuestionAnswer {
	private int answerId;
	private String rightAnswer;//题目答案
	private int titleId;//题目ID
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	public int getTitleId() {
		return titleId;
	}
	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}
	public QuestionAnswer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "QuestionAnswer [answerId=" + answerId + ", rightAnswer=" + rightAnswer + ", titleId=" + titleId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + answerId;
		result = prime * result + ((rightAnswer == null) ? 0 : rightAnswer.hashCode());
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
		QuestionAnswer other = (QuestionAnswer) obj;
		if (answerId != other.answerId)
			return false;
		if (rightAnswer == null) {
			if (other.rightAnswer != null)
				return false;
		} else if (!rightAnswer.equals(other.rightAnswer))
			return false;
		if (titleId != other.titleId)
			return false;
		return true;
	}
	
}
