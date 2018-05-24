package kr.green.javaspring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.green.javaspring.dao.Mapper;
import kr.green.javaspring.dao.UserVO;

@Controller
public class HomeController {
	
	@Autowired
	Mapper mapper;

	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)			// get방식과 post방식 둘다 사용하고 싶을 경우 중괄호 이용 method = {RequestMethod.GET, RequestMethod.POST}
	public String homeGet() {
		
		return "home";
	}
	

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String homePost(String id, String passwd, Model model) {
		
		model.addAttribute("id", id);
		model.addAttribute("passwd", passwd);
		return "redirect:/main";
	}
	
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String mainGet(String id, String passwd, Model model) {
		model.addAttribute("id", id);
		return "main";
	}
	
	@RequestMapping(value = "/main", method = RequestMethod.POST)
	   public String mainPost(HttpServletRequest request,Model model) {
		
	      String id = request.getParameter("id");
	      String passwd = request.getParameter("passwd");
	      UserVO user = mapper.getUser(id);
	     
	      if(user == null) {
	         return "redirect:/";
	         
	         }
	      
	      else if(user.getPasswd().compareTo(passwd) != 0)
	         return "redirect:/";
	      
	      return "main";
	   }
	
	
}


