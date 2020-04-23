package com.care.springmvc01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("aaa")//url aaa라면 aaa를 찾아감
	public String memberIndex() {
		
		return "member/index";
	}
	@GetMapping(value="/logout")//requestmapping,getMapping등이 있다 PostMA
	public String memberLogout(Model model) {//spring에 안에있는 타입
		model.addAttribute("logout","로그아웃");//model에 결과값을 담아 던져준다.
		return "/member/logout";
	}
	@GetMapping("login")
	public ModelAndView memberLogin() {
		ModelAndView mv= new ModelAndView();
		mv.addObject("login","로그인 성공!!");
		mv.setViewName("member/login");
		return mv;
	}
}
