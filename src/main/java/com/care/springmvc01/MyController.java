package com.care.springmvc01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("aaa")//url aaa��� aaa�� ã�ư�
	public String memberIndex() {
		
		return "member/index";
	}
	@GetMapping(value="/logout")//requestmapping,getMapping���� �ִ� PostMA
	public String memberLogout(Model model) {//spring�� �ȿ��ִ� Ÿ��
		model.addAttribute("logout","�α׾ƿ�");//model�� ������� ��� �����ش�.
		return "/member/logout";
	}
	@GetMapping("login")
	public ModelAndView memberLogin() {
		ModelAndView mv= new ModelAndView();
		mv.addObject("login","�α��� ����!!");
		mv.setViewName("member/login");
		return mv;
	}
}
