package com.siddhesh.kulkarni;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserForgotPassQA {
  @Id
  private String userid;
  private String question;
  private String answer;
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
  
}
