package com.siddhesh.kulkarni;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RecordTransaction implements Serializable {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	String userid;
	long accountsender;
	long accountreceiver;
	double amount;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public long getAccountsender() {
		return accountsender;
	}
	public void setAccountsender(long accountsender) {
		this.accountsender = accountsender;
	}
	public long getAccountreceiver() {
		return accountreceiver;
	}
	public void setAccountreceiver(long accountreceiver) {
		this.accountreceiver = accountreceiver;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}

