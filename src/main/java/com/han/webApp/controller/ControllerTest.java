package com.han.webApp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller   //��Ʈ�ѷ� ������̼�
public class ControllerTest {
	//������ ����, post�� ����
	
	@RequestMapping("/formData")
	public String formData(@RequestParam("name") String name, 
							@RequestParam("num") int num,
							@RequestParam("tel") String tel, Model model){
		
		model.addAttribute("name", name);
		model.addAttribute("num", num);
		model.addAttribute("tel", tel);
		return "formView";
	}
	/*
	@RequestMapping("/formData")
	public String formData(HttpServletRequest req, Model model){
		String name = req.getParameter("name");
		String num = req.getParameter("num");
		String tel = req.getParameter("tel");
		
		model.addAttribute("name", name);
		model.addAttribute("num", num);
		model.addAttribute("tel", tel);
		return "formView";
	}*/
	//a�±׷� ����
	@RequestMapping(value="/aLink", method=RequestMethod.GET)
	public String aLinkTest(HttpServletRequest req ,Model model){
		//Ŭ���Ʈ ������ ���� ����Ÿ
		String num = req.getParameter("num");
		String name = req.getParameter("name");
		
		//��� ����Ÿ ������
		model.addAttribute("num", num);
		model.addAttribute("name", name);
		return "aLink";//jsp���ϸ� - �����ϸ�
	}
	
	@RequestMapping("/view1")
	public String viewTest(Model model){
		//�̸�, ����ó
		model.addAttribute("name", "ȫ�浿");
		model.addAttribute("tel", "010-1234-5678");
		
		return "view1";
	}
}
