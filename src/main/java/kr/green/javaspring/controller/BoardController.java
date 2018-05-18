package kr.green.javaspring.controller;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.green.javaspring.dao.Board;
import kr.green.javaspring.dao.BoardMapper;

@Controller
@RequestMapping(value="/board/*")
public class BoardController {
	@Autowired
	BoardMapper boardMapper;
	
	@RequestMapping(value="/write",method= RequestMethod.GET)
	public String boardWriteGet(Model model) {
		
		return "write";
	}
	
	
	@RequestMapping(value="/write", method= RequestMethod.POST)
	public String boardWritePOST(Model model, HttpServletRequest request) {
		
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		String author = request.getParameter("author");
		boardMapper.setBoard(title, contents, author);
		return "redirect:/board/list";
	}
	
	
	@RequestMapping(value="/list", method= RequestMethod.GET)
	public String boardListGet(Model model, String title,  String author, String contents) {
		ArrayList<Board> list = (ArrayList)boardMapper.getBoards();
		model.addAttribute("list", list);
		return "board/list";
		
		
	}
}




