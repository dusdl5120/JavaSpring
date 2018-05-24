package kr.green.javaspring.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import kr.green.javaspring.page.Page;

public interface BoardMapper {
	
	public void setBoard(@Param("title") String title, @Param("contents") String contents, @Param("author") String author);
	
	public List<Board> getBoards();
	public Board getBoardById(@Param("number") int number);
	public void setUpdate(@Param("title") String title, @Param("contents") String contents, @Param("author") String author, @Param("number") int number);

	public List<Board> getPageBoards(Page p);		// 내가 페이지에 대한 정보를 넘겨주면 해당 리스트를 가져 오는 메소드
	
	
}

