package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {
	@RequestMapping("/")
public String home() {
	return "home";
}
	
	@RequestMapping("/admin")
public String admin() {
	return "admin";
	
}
	
	
	
	@GetMapping("/login")
	
	public String login(@RequestParam("email") String email,@RequestParam("pass") String pass) {
		String m1=null;
		if(email.equalsIgnoreCase("kshwet642@gmail.com")&&pass.equalsIgnoreCase("dhankar90")) {
			m1="success";
		}
	
		return m1;
	}
	
	@RequestMapping("/add")
	public String add() {
		return "add";
		
	}
	
	@RequestMapping("/delete")
	public String delete() {
		return "delete";
		
	}
	@RequestMapping("/student")
	public String student() {
		return "student";
		
	}
}
