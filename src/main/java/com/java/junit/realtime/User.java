package com.java.junit.realtime;

public class User {

	private int userId;
	private String name;
	private String emailId;
	private String phoneNumber;
	
	
	public User(int userId, String name, String emailId, String phoneNumber) {
		super();
		this.userId = userId;
		this.name = name;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", emailId=" + emailId + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	
	
	

}
