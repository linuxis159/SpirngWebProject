package com.community.japanese.dto;

public class LoginDTO {
	String userId;
	String userPassword;
	
	
	
	public LoginDTO() {

	}
	
	
	public LoginDTO(String userId, String userPassword) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
	}


	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	@Override
	public String toString() {
		return "LoginDTO [userId=" + userId + ", userPassword=" + userPassword + "]";
	}
	
	

	

}
