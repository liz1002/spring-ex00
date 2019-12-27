package com.khrd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.khrd.domain.BMICalculator;
import com.khrd.domain.MyInfo;

@Controller
public class BmiController {
private static final Logger logger = LoggerFactory.getLogger(SimpleController.class);
	
	@RequestMapping(value = "bmi", method = RequestMethod.GET)
	public String bmiGet() {
		logger.info("~~~~~ bmi Get ~~~~~");
		return "bmiForm";
	}
	
	@RequestMapping(value = "bmi", method = RequestMethod.POST)
	public String bmiPost(MyInfo myInfo, Model model) { //form의 name = class 변수명 (String name, int height, int weight, List hobbys)
		logger.info("~~~~~ bmi Post ~~~~~");
		logger.info(myInfo.toString());
		
		BMICalculator bmiCalc = new BMICalculator();
		bmiCalc.setLowWeight(18.5);
		bmiCalc.setNormal(23);
		bmiCalc.setOverWeight(25);
		bmiCalc.setObesity(30);
			
		myInfo.setBmiCalculator(bmiCalc);
		
		model.addAttribute("myInfo", myInfo);
		
//		model.addAttribute("name", name);
//		model.addAttribute("height", height);
//		model.addAttribute("weight", weight);
//		model.addAttribute("hobby1", hobby1);
//		model.addAttribute("hobby2", hobby2);
//		model.addAttribute("hobby3", hobby3);
		
		return "bmiResult";
	}
}
