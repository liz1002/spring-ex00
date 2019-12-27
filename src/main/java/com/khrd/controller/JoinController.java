package com.khrd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JoinController {

	private static final Logger logger = LoggerFactory.getLogger(SimpleController.class);
	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String joinGet() {
		logger.info("=====join Get=====");
		
		return "joinForm";
	}
	
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String joinPost(String name, String pass, Model model) { //form-name과 같아야 함
		logger.info("=====join Post=====");
		
		model.addAttribute("name", name);
		model.addAttribute("pass", pass);
		
		return "joinResult";
	}
}
