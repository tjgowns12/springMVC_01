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
		//req.getMethod()�� �ش��ϴ� request�� Ÿ���� ���´�
		model.addAttribute("age",req.getMethod()+"=>"+age);
		return "/member02/result";
		
	}
	//@RequestMapping(value="member02/result",method=RequestMethod.POST)
	//����Ʈ������� �Ѿ�°� �޾��ش� .
	@PostMapping("member02/result")
	//post������� �Ѿ�°� �Ȱ��� �޾��ش�.
	public String memberResult02(
			@RequestParam("name") String name,
//String name=req.getParameter("name");���� ����� ������ request�� �޾ƿ� ���� String name�� �־��ش� 
		@RequestParam("age") String age,Model model) {
		model.addAttribute("name", name+"����Ʈ");
		model.addAttribute("age", age+"����Ʈ");
				
		return "member02/result";
	}
	
}
