package com.springboot.springbootweb.controller;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.springbootweb.model.User;

@Controller
public class MyController {
	
	
	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("Header","Learn code with Prasanna");
		m.addAttribute("description","Home for programmers");
		
	}
	
	@RequestMapping(value="/form",method=RequestMethod.GET)
	public String form(Model model) {
		
		return "form";
	}
	
	@RequestMapping(value="/processform",method=RequestMethod.POST)
	public String show(@ModelAttribute User user,Model model) {
		
		
	 
		
		model.addAttribute("user",user);
		return "success";
	}
	
	
	
	
	
	

}
