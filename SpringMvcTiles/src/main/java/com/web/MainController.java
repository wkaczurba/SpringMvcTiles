package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String main() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}	
	
	@RequestMapping("/profile")
	public String profile() {
		return "profile";
	}
	
	@RequestMapping("/home") 
	public String home() {
		return "home";
	}
}
