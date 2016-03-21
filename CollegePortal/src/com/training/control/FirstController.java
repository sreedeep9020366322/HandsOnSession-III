package com.training.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.Student;

@Controller
@RequestMapping("/first.htm")
public class FirstController {

	@Autowired
	private ModelAndView mdl;
	
	@Autowired
	private Student student;
	
//	@RequestMapping("/add")
	public ModelAndView init(){

			
		mdl.setViewName("AddDetails");
		
		mdl.addObject("student",student);
		
		return mdl;
	}
	
}