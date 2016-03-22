package com.training.control;


import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.domains.HibernateSpringStudent;
import com.training.entity.Student;

@Controller
public class FirstController {

	Logger log = Logger.getLogger(this.getClass().getName());
	
	@Autowired
	private ModelAndView mdl;
	
	@Autowired
	private Student student;
	
	@Autowired
	HibernateSpringStudent dao;
	@RequestMapping("/")
	public String returnIndex(){
		return "index";
	}
	@RequestMapping(value="/first",method= RequestMethod.GET)
	public ModelAndView init(){

		mdl.setViewName("AddDetails");
		
		mdl.addObject("command",student);
		
		return mdl;
	}
	
	@RequestMapping(value= "/first",method= RequestMethod.POST)
	public ModelAndView onSubmit(@ModelAttribute("student") Student student) {
		
		Long key = (Long)dao.add(student);
		
		mdl.setViewName("Success");
		
		return mdl;
		
	}
	
	
	
	
}