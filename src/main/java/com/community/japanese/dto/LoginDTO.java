package com.community.japanese.dto;

public class LoginDTO {
	String userId;
	String userPassword;
	
	
	public LoginDTO() {

	}
	public LoginDTO(String iD, String password) {
		userId = iD;
		this.userPassword = password;
	}
	public String getID() {
		return userId;
	}
	public void setID(String iD) {
		userId = iD;
	}
	public String getPassword() {
		return userPassword;
	}
	public void setPassword(String password) {
		this.userPassword = password;
	}
	@Override
	public String toString() {
		return "LoginDTO [ID=" + userId + ", password=" + userPassword + "]";
	}
	

}
