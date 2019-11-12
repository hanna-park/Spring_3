package com.qq.s3.util;

public class Pager {

	
	private Integer curPage; //현재 페이지 번호
	private Integer perPage; //불러올 때 글의 개수

	private String kind;	//검색 종류
	private String search;	// 검색어
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getSearch() {
		if(search == null)
			search ="";
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	
	//DB
	private Integer startRow;	//시작 rownum
	private Integer lastRow;	//끝 rownum
	
	
	//View(jsp)
	private Integer startNum;	//시작 번호
	private Integer lastNum;	//끝 번호
	private Integer curBlock;	//현재 블럭 번호
	private Integer totalBlock;	//전체 블럭 개수
	
	public Integer getStartNum() {
		return startNum;
	}
	public void setStartNum(Integer startNum) {
		this.startNum = startNum;
	}
	public Integer getLastNum() {
		return lastNum;
	}
	public void setLastNum(Integer lastNum) {
		this.lastNum = lastNum;
	}
	public Integer getCurBlock() {
		return curBlock;
	}
	public void setCurBlock(Integer curBlock) {
		this.curBlock = curBlock;
	}
	public Integer getTotalBlock() {
		return totalBlock;
	}


	
	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public Integer getLastRow() {
		return lastRow;
	}

	public void setLastRow(Integer lastRow) {
		this.lastRow = lastRow;
	}

	

	public Integer getPerPage() {
		return perPage;
	}

	public void setPerPage(Integer perPage) {
		this.perPage = perPage;
	}
}