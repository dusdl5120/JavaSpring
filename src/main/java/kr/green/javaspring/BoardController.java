package kr.green.javaspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/board/*")
public class BoardController {
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String boardListGet(Model model) {
		Board board = new Board("제목", "저자", "내용", 1);

		model.addAttribute("board", board);

		return "board/list";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String boardInsert() {
		
		return "board/insert";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(String title, String author, String contents, String number, Model model) {
		
		System.out.println("제목 : " + title + ", 저자 : " + author + ", 내용 : " + contents + ", 번호 " + number);
		
		//Board board = new Board("제목", "저자", "내용", 1);
		//model.addAttribute("board", board);
		model.addAttribute("title", title);
		model.addAttribute("author", author);
		model.addAttribute("contents", contents);
		model.addAttribute("number", number);
		
		return "redirect:/board/insertSuc";
	}
	
	@RequestMapping(value = "/insertSuc", method = RequestMethod.GET)
	public String boardInserted(String title, String author, String contents, String number, Model model) {
		
		model.addAttribute("title", title);
		model.addAttribute("author", author);
		model.addAttribute("contents", contents);
		model.addAttribute("number", number);
		
		return "board/insertSuc";
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(String title, String author, String contents, String number, Model model) {
		
		model.addAttribute("title", title);
		model.addAttribute("author", author);
		model.addAttribute("contents", contents);
		model.addAttribute("number", number);
		
		return "board/detail";
	}
}









