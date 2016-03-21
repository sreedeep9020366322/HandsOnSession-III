package com.training.control;


import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.domains.HibernateSpringExample;
import com.training.entity.Student;

@Controller
@RequestMapping("*.htm")
public class FirstController {

	Logger log = Logger.getLogger(this.getClass().getName());
	
	@Autowired
	private ModelAndView mdl;
	
	@Autowired
	private Student student;
	
	@Autowired
	HibernateSpringExample dao;
	
	@RequestMapping(name="/first.htm",method= RequestMethod.GET)
	public ModelAndView init(){

		log.info("=====================came======================");
		mdl.setViewName("AddDetails");
		
		mdl.addObject("command",student);
		
		return mdl;
	}
	
	@RequestMapping(name= "/first.htm",method= RequestMethod.POST)
	public ModelAndView onSubmit(@ModelAttribute("student") Student student) {
		
		log.info("------------------------------came-----------------");
		
		Long key = (Long)dao.add(student);
		
		log.info("=================="+key);
		mdl.setViewName("Success");
		
		return mdl;
		
	}
	
	@RequestMapping(name="/second.htm")
	public ModelAndView view(){

		log.info("=====================came======================");
		mdl.setViewName("ViewDetails");
		
		List<Student> studentList = dao.findAll();
		mdl.addObject("studentList",studentList);
		
		return mdl;
	}

	
	
}