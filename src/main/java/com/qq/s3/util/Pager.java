package com.qq.s3.util;

public class Pager {
	
	private Integer curPage; //현재 페이지 번호
	private Integer perPage; //불러올 때 글의 개수
	
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
	public void setTotalBlock(Integer totalBlock) {
		this.totalBlock = totalBlock;
	}

	
	
	
	///////////////////////////////////////
	
	public Integer getCurPage() {
		if(curPage ==null || curPage==0) {
			curPage=1;
		}
		
		return curPage;
	}
	public void setCurPage(Integer curPage) {
		this.curPage = curPage;
	}
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
	
	
	//makeRow
	public void makeRow() {
		this.startRow = (this.getCurPage()-1)*this.getPerPage()+1;
		this.lastRow = this.getCurPage()*this.getPerPage();
	}

	//makePage
	public void makePage(int totalCount) {
		//2. totalPage
		int totalPage = totalCount/this.getPerPage();
		if(totalCount%this.getPerPage() != 0) {
			totalPage++;
		}
		
		//3. totalBlock
		int perBlock = 5;
		totalBlock = totalPage/perBlock;
		if(totalPage%perBlock != 0 ) {
			totalBlock++;
		}
		
		//4. curPage로 curBlock 구하기
		curBlock = this.getCurPage()/perBlock;
		if(this.getCurPage()%perBlock != 0) {
			curBlock++;
		}
		
		//5. curBlock으로 startNum, lastNum
		startNum = (curBlock-1)*perBlock+1;
		lastNum = curBlock*perBlock;
		
		if(curBlock == totalBlock) {
			lastNum = totalPage;
		}
		
	}
	

	
}
