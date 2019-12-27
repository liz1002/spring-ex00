package com.khrd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalcController {
private static final Logger logger = LoggerFactory.getLogger(SimpleController.class);
	
	@RequestMapping(value = "calc", method = RequestMethod.GET)
	public String calcGet() {
		logger.info("~~~~~ calc Get ~~~~~");
		return "calcForm";
	}
	
	@RequestMapping(value = "calc", method = RequestMethod.POST)
	public String calcPost(int num1, int num2, String calc, Model model) {
		logger.info("~~~~~ calc Post ~~~~~");
		
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("calc", calc);
		
		return "calcResult";
	}
}
