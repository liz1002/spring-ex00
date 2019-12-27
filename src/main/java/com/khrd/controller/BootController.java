package com.khrd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BootController {
	private static final Logger logger = LoggerFactory.getLogger(SimpleController.class);
	
	@RequestMapping(value = "bTable", method = RequestMethod.GET)
	public String table1() {
		return "bootTable1";
	}
	
	@RequestMapping(value = "bGrid", method = RequestMethod.GET)
	public String grid1() {
		return "bootGrid";
	}
	
	@RequestMapping(value = "bNavBar", method = RequestMethod.GET)
	public String navBar1() {
		return "bootNavBar";
	}
	
	@RequestMapping(value = "bModal", method = RequestMethod.GET)
	public String modal1() {
		return "bootModal";
	}
	
	@RequestMapping(value = "bsEx", method = RequestMethod.GET)
	public String bxEx() {
		return "bootStrapEx";
	}
}
