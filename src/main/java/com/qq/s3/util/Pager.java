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

	
	
	///////////////////////////////////////
	

	public Integer getPerPage() {
		if(perPage == null || perPage ==0) {
			perPage=10;
		}
		return perPage;
	}
	public void setPerPage(Integer perPage) {
		this.perPage = perPage;
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
	
	
	


	public Integer getCurPage() {
		if(this.curPage == null || this.curPage==0) {
			this.curPage =1;
		}
		return curPage;
	}

	public void setCurPage(Integer curPage) {
		this.curPage = curPage;
	}
	
	public void makePager(int totalCount) {
		//1. 전체 글의 개수
		
		
		//2. 전체 페이지의 개수
		int totalPage= totalCount/perPage;
		if(totalCount%perPage != 0) {
			totalPage++;
		}
		
		//3. 전체 블럭의 개수
		int perBlock = 5;
		totalBlock = totalPage/perBlock;
		if(totalPage%perBlock != 0) {
			totalBlock++;
		}
		
		//4. curPage를 이용해서 curBlock 구하기
		curBlock = curPage / perBlock;
		if(curPage%perBlock != 0) {
			curBlock++;
		}
		
		//5. curBlock으로 startNum, lastNum 구하기
		startNum = (curBlock-1)*perBlock+1;
		lastNum= curBlock*5;

	}
	
	
	public void makeRow() {
		//rownum 계산
		this.startRow = (this.getCurPage()-1)*this.getPerPage()+1;
		this.lastRow = this.getCurPage()*this.getPerPage();

	}
	

	
}
