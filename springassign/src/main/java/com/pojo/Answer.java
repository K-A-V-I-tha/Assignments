package com.pojo;

public class Answer {
	private int a_id;
	private String answer;
	private String a_by;
	
	public Answer() {
		super();
	}
	
	public Answer(int a_id, String answer, String a_by) {
		super();
		this.a_id = a_id;
		this.answer = answer;
		this.a_by = a_by;
	}

	@Override
	public String toString() {
		return "Answer [a_id=" + a_id + ", answer=" + answer + ", a_by=" + a_by + "]";
	}
}
