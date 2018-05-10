package kr.green.javaspring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	
	// 처음 home.jsp 호출하기 위한 메소드
	@RequestMapping(value = "/", method = RequestMethod.GET)			// get방식과 post방식 둘다 사용하고 싶을 경우 중괄호 이용 method = {RequestMethod.GET, RequestMethod.POST}
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";		// home.jsp로 이동
	}
	
	
	// 로그인 폼화면
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String loginForm() {
		
		return "login";
	}
	
	 
	// 로그인 입력결과값 전송
	@RequestMapping(value="/login", method= RequestMethod.POST)
	public String login(String id, String passwd, Model model) {
		
		System.out.println("user_id : " + id + ", user_passwd : " + passwd);
		 
		model.addAttribute("id", id);
		model.addAttribute("passwd", passwd);
		
		return "redirect:/login/success";
	}
	
	// 로그인 입력결과값 출력화면
	@RequestMapping(value="/login/success", method = {RequestMethod.GET, RequestMethod.POST})
	public String loginSuccess(String id, String passwd, Model model) {
		
		model.addAttribute("id", id);
		model.addAttribute("passwd", passwd);
		
		return "login_suc";
	}
	
	
	// 회원가입 폼화면
	@RequestMapping(value="/join", method= RequestMethod.GET)
	public String joinForm() {
		
		return "join";
	}
	
	
	// 회원가입 입력결과값 전송
	@RequestMapping(value="/join", method= RequestMethod.POST)
	public String join(String name, String id, String passwd, String email, Model model) {
		
		System.out.println("user_name : " + name + ", user_id : " + id + ", user_passwd : " + passwd + ", user_email : " + email);
		
		model.addAttribute("name", name);
		model.addAttribute("id", id);
		model.addAttribute("passwd", passwd);
		model.addAttribute("email", email);
		
		return "redirect:/join/success";
	}
	
	
	// 회원가입 입력결과값 출력화면
	@RequestMapping(value="/join/success", method = {RequestMethod.GET, RequestMethod.POST})
	public String joinSuccess(String name, String id, String passwd, String email, Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("id", id);
		model.addAttribute("passwd", passwd);
		model.addAttribute("email", email);
		
		return "join_suc";
	}
}


