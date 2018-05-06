package kr.green.javaspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/board")
public class ExampleController {
	
	// 등록 폼화면
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String insert() {
		
		
		return "insert";
	}
	
	// 등록 전송
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String inserted(String name, int score, int age, Model model) {
		
		System.out.println(name + " , " + score + "점, "+ age + "세");

		model.addAttribute("name", name);
		model.addAttribute("score", score);
		if (age != 0) model.addAttribute("age", age);		
		
		if(name != null && age != 0) {
			
			return "redirect:/board/inserted";
		}
		
		return "insert";
	}
	
	
	// 등록 폼결과화면
	@RequestMapping(value = "inserted", method = RequestMethod.GET) 
	public String signupSuccess(String name, int score, int age, Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("score", score);
		if (age != 0) model.addAttribute("age", age);								
		
		return "inserted";		// success_signup.jsp로 이동
			
	}
	
}
