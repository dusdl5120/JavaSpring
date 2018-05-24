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
import kr.green.javaspring.page.Page;

@Controller
@RequestMapping(value="/board/*")
public class BoardController {
	@Autowired
	BoardMapper boardMapper;
	
	@RequestMapping(value="/write",method= RequestMethod.GET)
	public String boardWriteGet(Model model) {
		
		return "board/write";
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
	public String boardListGet(Model model) {
		
		Page p = new Page(2,5);
		ArrayList<Board> list = (ArrayList)boardMapper.getPageBoards(p);
		model.addAttribute("list", list);
		return "board/list";
		
	}
	
	
	@RequestMapping(value="/detail", method= RequestMethod.GET)
	public String boardDetailGet(Model model, int number) {			// number로 상세정보를 확인하기 위해 매개변수는 이것만 있으면 됨
		
		Board detail = boardMapper.getBoardById(number);
		
		model.addAttribute("detail", detail);
		return "board/detail";
		
	}
	
	@RequestMapping(value="/detail", method= RequestMethod.POST)
	public String boardDetailPost(Model model, HttpServletRequest r) {			
		
		int number = Integer.parseInt(r.getParameter("number"));
		System.out.println(number);
		
		String title = r.getParameter("title");
		String contents = r.getParameter("contents");
		String author = r.getParameter("author");
		
		boardMapper.setUpdate(title, contents, author, number);
		
		return "redirect:/board/list";
		
	}
	
	
	
	
}




