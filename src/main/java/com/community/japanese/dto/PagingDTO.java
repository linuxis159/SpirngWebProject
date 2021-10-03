package com.community.japanese.dto;

public class PagingDTO {
	int boardIdNum;
	int page;
	int sort;
	int maxPage;
	int pageRange;
	int startPage;
	int endPage;
	
	
	public PagingDTO() {

	}


	public PagingDTO(int boardIdNum, int page, int sort, int pageRange, int maxPage) {
		super();
		this.boardIdNum = boardIdNum;
		this.page = page;
		this.sort = sort;
		this.pageRange = pageRange;
		this.startPage = startPage;
		this.endPage = endPage;
		this.maxPage = maxPage;
	}


	public int getBoardIdNum() {
		return boardIdNum;
	}


	public void setBoardIdNum(int boardIdNum) {
		this.boardIdNum = boardIdNum;
	}


	public int getPage() {
		return page;
	}


	public void setPage(int page) {
		this.page = page;
	}


	public int getSort() {
		return sort;
	}


	public void setSort(int sort) {
		this.sort = sort;
	}


	public int getPageRange() {
		return pageRange;
	}


	public void setPageRange(int pageRange) {
		this.pageRange = pageRange;
	}


	public int getStartPage() {
		this.startPage = (page/(pageRange+1)) * pageRange + 1;
		if(this.startPage <= 1) {
			return 1;
		}
		return this.startPage;
		
	}


	public int getEndPage() {
		this.endPage = (this.page / (this.pageRange+1)) * this.pageRange +5;
		if(this.endPage >= this.maxPage) {
			return this.maxPage;
		}
		return this.endPage;
	}


	public int getMaxPage() {
		return maxPage;
	}


	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}


	
	
	
	
	

	
	
	

}
