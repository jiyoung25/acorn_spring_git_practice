package com.gura.boot06;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home(HttpServletRequest request) {
		List<String> noticeList = new ArrayList<>();
		noticeList.add("Spring 연습하기");
		noticeList.add("git 연습하기");
		noticeList.add("branch 만들기");
		request.setAttribute("noticeList", noticeList);
		
		return "home";
	}
	
	@RequestMapping("/woocheol_form")
	public String woocheolForm() {
		return "woocheol_form";
	}
}
