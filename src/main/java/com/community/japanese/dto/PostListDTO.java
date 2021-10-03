package com.community.japanese.dto;

public class PostListDTO {
	int boardIdNum;
	int page;
	int range;
	public PostListDTO() {
	
	}
	public PostListDTO(int boardId, int page, int range) {
		super();
		this.boardIdNum = boardId;
		this.page = page;
		this.range = range;
	}
	public int getBoardIdNum() {
		return boardIdNum;
	}
	public void setBoardIdNum(int boardId) {
		this.boardIdNum = boardId;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	@Override
	public String toString() {
		return "PostListDTO [boardId=" + boardIdNum + ", page=" + page + ", range=" + range + "]";
	}
	
	
	
}
