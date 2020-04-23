package com.care.springmvc01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController02 {
	@RequestMapping("/member02/index")
	public String memberIndex() {
		return "member02/index";
		
	}
	@RequestMapping("member02/result")
	//@GetMapping("member02/result")
	
	public String memberResult(HttpServletRequest req,Model model) {
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		model.addAttribute("name",req.getMethod()+"=>"+name);
		//req.getMethod()는 해당하는 request의 타입이 나온다
		model.addAttribute("age",req.getMethod()+"=>"+age);
		return "/member02/result";
		
	}
	//@RequestMapping(value="member02/result",method=RequestMethod.POST)
	//포스트방식으로 넘어온걸 받아준다 .
	@PostMapping("member02/result")
	//post방식으로 넘어온걸 똑같이 받아준다.
	public String memberResult02(
			@RequestParam("name") String name,
//String name=req.getParameter("name");위에 내용과 동일함 request로 받아온 값을 String name에 넣어준다 
		@RequestParam("age") String age,Model model) {
		model.addAttribute("name", name+"포스트");
		model.addAttribute("age", age+"포스트");
				
		return "member02/result";
	}
	
}
