package com.community.japanese.vo;

import java.util.Date;

import com.community.japanese.datesetting.DateFormat;

public class Post {
	int postIdNum;
	int userIdNum;
	int boardIdNum;
	int rNum;
	String postTitle;
	String postArticle;
	Date postRagDate;
	int postView;
	int likePost;
	int dislikePost;
	String subtitleCheck; // 0 is no subtitle
	public Post() {

	}
	public Post(int postIdNum, int userIdNum, int boardIdNum, int rNum, String postTitle, String postArticle,
			Date postRagDate, int postView, int likePost, int dislikePost, String subtitleCheck) {
		super();
		this.postIdNum = postIdNum;
		this.userIdNum = userIdNum;
		this.boardIdNum = boardIdNum;
		this.rNum = rNum;
		this.postTitle = postTitle;
		this.postArticle = postArticle;
		this.postRagDate = postRagDate;
		this.postView = postView;
		this.likePost = likePost;
		this.dislikePost = dislikePost;
		this.subtitleCheck = subtitleCheck;
	}
	public int getPostIdNum() {
		return postIdNum;
	}
	public void setPostIdNum(int postIdNum) {
		this.postIdNum = postIdNum;
	}
	public int getUserIdNum() {
		return userIdNum;
	}
	public void setUserIdNum(int userIdNum) {
		this.userIdNum = userIdNum;
	}
	public int getBoardIdNum() {
		return boardIdNum;
	}
	public void setBoardIdNum(int boardIdNum) {
		this.boardIdNum = boardIdNum;
	}
	public int getrNum() {
		return rNum;
	}
	public void setrNum(int rNum) {
		this.rNum = rNum;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostArticle() {
		return postArticle;
	}
	public void setPostArticle(String postArticle) {
		this.postArticle = postArticle;
	}
	
	public String getPostRagDate() {
		String afterFormat = DateFormat.setDateFormat(postRagDate);
		return afterFormat;
	}
	
	public void setPostRagDate(Date postRagDate) {
		this.postRagDate = postRagDate;
	}
	public int getPostView() {
		return postView;
	}
	public void setPostView(int postView) {
		this.postView = postView;
	}
	public int getLikePost() {
		return likePost;
	}
	public void setLikePost(int likePost) {
		this.likePost = likePost;
	}
	public int getDislikePost() {
		return dislikePost;
	}
	public void setDislikePost(int dislikePost) {
		this.dislikePost = dislikePost;
	}
	public String getSubtitleCheck() {
		return subtitleCheck;
	}
	public void setSubtitleCheck(String subtitleCheck) {
		this.subtitleCheck = subtitleCheck;
	}
	@Override
	public String toString() {
		return "Post [postIdNum=" + postIdNum + ", userIdNum=" + userIdNum + ", boardIdNum=" + boardIdNum + ", rNum="
				+ rNum + ", postTitle=" + postTitle + ", postArticle=" + postArticle + ", postRagDate=" + postRagDate
				+ ", postView=" + postView + ", likePost=" + likePost + ", dislikePost=" + dislikePost
				+ ", subtitleCheck=" + subtitleCheck + "]";
	}
	

	



	
	
	

	
	

	
}
