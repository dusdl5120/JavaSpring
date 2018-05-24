package kr.green.javaspring.page;

public class Page {

	private int page;			// 현재 페이지번호
	private int perPageNum;		// 한 페이지당 나타낼수 있는 글의 최대 개수
	
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		
		// 예외처리
		if (page <=0) 
			this.page = 1;
		else
			this.page = page;
				
		this.page = page;
	}
	public int getPerPageNum() {
		return perPageNum;
	}
	public void setPerPageNum(int perPageNum) {
		
		if(perPageNum <=0 || perPageNum > 50) 		// 한 페이지의 개수가 50이 넘으면
			this.perPageNum = 10;					// 10개로 지정해주겟다
		else
			this.perPageNum = perPageNum;
	}
	
	
	public Page() {
		
		page = 1;				// 기본페이지는 1페이지
		perPageNum = 10;		// 한 페이지당 글 목록 개수 10개
		
	}
	
	public Page(int page, int perPageNum) {
			
		this.setPage(page);
		this.setPerPageNum(perPageNum); 
		
	}
	
	public int getPageStart() {				// 리스트를 몇번째부터 가져올건지  (xml에서 limit 함수 사용)
		
		return (page-1) * perPageNum;
	}
	
}
