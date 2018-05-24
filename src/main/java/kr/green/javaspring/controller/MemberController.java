package kr.green.javaspring.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.green.javaspring.dao.Mapper;

@Controller
@RequestMapping(value="/member/*")
public class MemberController {
	@Autowired
	Mapper mapper;
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String memberSignupGet() {
		
		return "member/signup";
		
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String memberSignupPost(HttpServletRequest request, Model model) {
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		String email = request.getParameter("email");
		if (mapper.getUser(id) != null)
			return "redirect:/member/signup";
		mapper.setUser(id, passwd, email);
		return "redirect:/member/signup/success";
		
	}

	@RequestMapping(value = "/signup/success", method = RequestMethod.GET)
	public String memberSignupSuccessGet(String id, String email, Model model) {
		
		model.addAttribute("id", id);
		model.addAttribute("email", email);
		return "member/signupSuccess";
		
	}
	
}
