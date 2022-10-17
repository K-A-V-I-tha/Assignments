package com.pojo;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int q_id;
	private String q_name;
	private List<Answer> answers;
	
	
	public Question(int q_id, String q_name, List<Answer> answers) {
		super();
		this.q_id = q_id;
		this.q_name = q_name;
		this.answers = answers;
	}
	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		System.out.println("Que: "+q_id+"."+q_name);
		Iterator<Answer> itr =answers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}


	@Override
	public String toString() {
		return "Question [q_id=" + q_id + ", q_name=" + q_name + ", answers=" + answers + "]";
	}
	
	
	
}
