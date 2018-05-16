package kr.green.javaspring;

public class Board {

	private String title;		// 제목
	private String author;		// 저자
	private String contents;	// 내용
	private int number;		// 번호
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	
	public Board(String title, String author, String contents, int number) {
		
		this.title= title;
		this.author = author;
		this.contents = contents;
		this.number = number;
	}
	
	
	
}
