package kr.green.javaspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller		
@RequestMapping(value = "/signup")			// 해당 url에 오면 이 메소드를 통해 처리해라		
public class AccountController {

	// signup.jsp 폼만을 호출하기 위한 메소드
	@RequestMapping(value = "", method = RequestMethod.GET)									// GET방식일 때만 이 메소드를 사용			 
	public String signup() {																// GET이냐 POST와는 상관없이 그냥 쓰고싶다. 그러면 method지우면됨
		
		return "signup";	// signup.jsp로 이동	
	}
	
	
	
	// signup.jsp 폼을 호출한 후의 입력결과 메소드											// jsp에서 form을 입력했으면 그에 해당하는 폼의 결과값을 가져와야하므로 꼭 POST로!!
	@RequestMapping(value = "", method = RequestMethod.POST)								// POST로 받지 않으면 웹상에서 입력한 값을 확인할 수 없고, 
																							// 경우에 따라 두개 다써주는 경우도 있음 
	public String signup(String id, String passwd, String email, String phone1, String phone2, String phone3, String birth1, String birth2, String birth3, Model model) {					
		
		System.out.println(id + ", " + passwd + " , " + email + ", " + phone1 + " - " + phone2 + " - " + phone3 + " , " + birth1 + "년 " + birth2 + "월 " + birth3 + "일 ");
		
		// id의 값이 있으면, id의 값을 model에 "id"의 값을 넣어줘라
		if (!isEmpty(id)) model.addAttribute("id", id);										// jsp에서의 name값이 id인 것을 model의 id에 저장
		if (!isEmpty(passwd)) model.addAttribute("passwd", passwd);							// model은 html에 정보를 주는 역할을 하는 것
		if (!isEmpty(email)) model.addAttribute("email", email);							// 그럼 html에서 저 이름으로 value값을 ${}로 사용할 수 있음
		
		if (!isEmpty(id) && !isEmpty(passwd) && !isEmpty(email)) 							// 만약 이 조건이 맞는다면
			
			// return "success_signup";														// 1. 따로 jsp 경로를 정해주지 않고 /signup 상태에서 페이지만 바뀌는것
																							//    근데 이 방식은 별로 비추. 나중에 버튼하나 생기고 그러면 복잡해짐
			
			return "redirect:/signup/success";												// 2. 이 방식은 success 파일로 가라는게 아니라 저 url 경로로 가라		
		
		return "signup";	// signup.jsp로 이동	
	}
	
	
	
	// 위의 if문의 코드를 줄이기 위한 함수
	public boolean isEmpty(String s) {
		if(s == null || s.length() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	// signup.jsp를 통한 결과 메소드
	@RequestMapping(value = "success", method = RequestMethod.GET) 
	public String signupSuccess(String id, String passwd, String email, String phone1, String phone2, String phone3, String birth1, String birth2, String birth3, Model model) {
		
		// id의 값이 있으면, id의 값을 model에 "id"의 값을 넣어줘라
		if (!isEmpty(id)) model.addAttribute("id", id);										
		if (!isEmpty(passwd)) model.addAttribute("passwd", passwd);							
		if (!isEmpty(email)) model.addAttribute("email", email);							
		
		return "success_signup";		// success_signup.jsp로 이동
			
	}
	
	
	// signIn 화면출력을 위한 메소드
	@RequestMapping(value = "signin" , method = RequestMethod.GET)
	public String signIn() {
		
		return "signin";
		
		
	}
	
	
	// 로그인 처리를 위한 메소드 (결과)
	@RequestMapping(value = "signin" , method = RequestMethod.POST)
	public String signInSuccess(String id, String passwd) {
		
		String user_id = "1234";
		String user_pw = "1234";

		if(user_id.compareTo(id) == 0 && user_pw.compareTo(passwd) == 0) {
			return "redirect:/signup/success";
		}
		
		return "signin";
		
		
	}
	
}












