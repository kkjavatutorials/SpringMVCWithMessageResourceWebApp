package com.infotech.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.infotech.model.User;

@Controller
public class UserHandlerController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String registerPage(Model model){
		model.addAttribute(new User());
		return "index";
	}

	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView welcomePage(@Valid @ModelAttribute("user") User user,BindingResult result){
		ModelAndView modelAndView = null;
		if(result.hasErrors()){
			modelAndView = new ModelAndView("index");
			return modelAndView;
		}
		modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	
	@ModelAttribute
	public void modelData(Model model){
		List<String> locationList = new ArrayList<>();
		locationList.add("Kalewadi");
		locationList.add("Lohegaon");
		locationList.add("Pimple Saudagar");
		locationList.add("Other");
		
		List<String> genderList = new ArrayList<>();
		genderList.add("Male");
		genderList.add("Female");
		
		model.addAttribute("locationsList", locationList);
		model.addAttribute("genderList", genderList);
	}
}
