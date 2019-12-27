package com.khrd.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.khrd.domain.MemberVO;

@Controller
public class SimpleController {
	private static final Logger logger = LoggerFactory.getLogger(SimpleController.class);
	
	@RequestMapping(value = "doB", method = RequestMethod.GET)
	public String doB(Model model) { //spring이 알아서 매개변수 값 넣어줌
		logger.info("=========doB");
		model.addAttribute("test", 1); // = setAttribute (매개변수 반드시 선언)
		return "doB";
	}
	
	@RequestMapping(value = "doC", method = RequestMethod.GET)
	public String doC(String msg, String msg2, int msg3) { //String 타입이 아닌 매개변수는 반드시 값을 보내야 함
		logger.info("========doC , msg : " + msg + " , msg2 : " + msg2 + " , msg3 : " + msg3);
		return "doB";
	}
	
	@RequestMapping(value = "doD", method = RequestMethod.GET)
	public String doD(String msg, Model model) {
		logger.info("========doD , msg : " + msg);
		model.addAttribute("test", msg);
		return "doB";
	}
	
	@RequestMapping(value = "doE", method = RequestMethod.GET)
	public String doE(@ModelAttribute("test") String msg) { //모델 매개변수 대신 사용 @ModelAttribute("key"), 서버에서 넘겨주는 키와 동일 해야 함
		logger.info("========doE , msg : " + msg);
		return "doB";
	}
	
	@RequestMapping(value = "doF", method = RequestMethod.GET)
	public String doF(Model model) {
		logger.info("========doF");
		
		MemberVO vo = new MemberVO();
		vo.setUserid("user00");
		vo.setUserpw("pass00");
		
		model.addAttribute("member", vo);
		
		return "doF";
	}
	
	@RequestMapping(value = "doG", method = RequestMethod.GET)
	public String doG(Model model) {
		logger.info("========doG");
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		list.add(new MemberVO("user00", "pass00"));
		list.add(new MemberVO("user01", "pass01"));
		list.add(new MemberVO("user02", "pass02"));
		
		model.addAttribute("list", list);
		
		return "doG";
	}
	
	@RequestMapping(value = "doForward", method = RequestMethod.GET)
	public String doForward() {
		logger.info("========doForward");
		
		return "forward:/doB";
	}
	
	@RequestMapping(value = "doRedirect", method = RequestMethod.GET)
	public String doRedirect() {
		logger.info("========doRedirect");
		
		return "redirect:/doF";
	}
	
	@ResponseBody //String이 아닌 객체를 리턴할 때 Json String으로 바꿔서 브라우저에 돌려줌
	@RequestMapping(value = "doJson", method = RequestMethod.GET)
	public List<MemberVO> doJson() {
		logger.info("========doJson");
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		list.add(new MemberVO("user00", "pass00"));
		list.add(new MemberVO("user01", "pass01"));
		list.add(new MemberVO("user02", "pass02"));
		
		return list;
	}
}
