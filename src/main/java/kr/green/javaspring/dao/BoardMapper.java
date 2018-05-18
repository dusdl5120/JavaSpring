package kr.green.javaspring.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoardMapper {
	
	public void setBoard(@Param("title") String title,
			@Param("contents") String contents,@Param("author") String author);
	
	public List<Board> getBoards();
	
	
	
}

