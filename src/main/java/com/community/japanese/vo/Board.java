package com.community.japanese.vo;

import java.util.Date;

public class Board {
	int boardIdNum;
	String boardName;
	Date boardRagDate;
	
	
	public Board() {
		
	}
	public Board(int boardIdNum, String boardName, Date boardRagDate) {
		super();
		this.boardIdNum = boardIdNum;
		this.boardName = boardName;
		this.boardRagDate = boardRagDate;
	}
	public int getBoardIdNum() {
		return boardIdNum;
	}
	public void setBoardIdNum(int boardIdNum) {
		this.boardIdNum = boardIdNum;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public Date getBoardRagDate() {
		return boardRagDate;
	}
	public void setBoardRagDate(Date boardRagDate) {
		this.boardRagDate = boardRagDate;
	}
	@Override
	public String toString() {
		return "Board [boardIdNum=" + boardIdNum + ", boardName=" + boardName + ", boardRagDate=" + boardRagDate + "]";
	}
	
	

}
