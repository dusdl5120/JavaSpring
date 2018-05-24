package kr.green.javaspring.page;

public class PageMaker {
	
	private int totalCount;			// DB에서 SQL문으로 검색한 결과의 컬럼의 개수
	private int startPage;			// 해당 페이지네이션의 시작페이지 (1, 11, 21 ...)
	private int endPage;			// 해당 페이지네이션의 마지막페이지 (2, 3, 4, 10, 20, 30 ...) - 글의 개수에 따라 달라짐
	private boolean prev;			
	private boolean next;
	
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	
	
	
	
	

}
