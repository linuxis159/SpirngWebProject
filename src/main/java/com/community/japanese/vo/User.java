package com.community.japanese.vo;

import java.util.Date;

public class User {
	int userIdNum;
	String userId;
	String password;
	String nickName;
	Date ragDate;
	int lv;
	int exp;
	public User() {
	}
	public User(int userIdNum, String userId, String password, String nickName, Date ragDate, int lv, int exp) {
		super();
		this.userIdNum = userIdNum;
		this.userId = userId;
		this.password = password;
		this.nickName = nickName;
		this.ragDate = ragDate;
		this.lv = lv;
		this.exp = exp;
	}
	public int getUserIdNum() {
		return userIdNum;
	}
	public void setUserIdNum(int userIdNum) {
		this.userIdNum = userIdNum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Date getRagDate() {
		return ragDate;
	}
	public void setRagDate(Date ragDate) {
		this.ragDate = ragDate;
	}
	public int getLv() {
		return lv;
	}
	public void setLv(int lv) {
		this.lv = lv;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "User [userIdNum=" + userIdNum + ", userId=" + userId + ", password=" + password + ", nickName="
				+ nickName + ", ragDate=" + ragDate + ", lv=" + lv + ", exp=" + exp + "]";
	}
	
	
	
	
	
}
