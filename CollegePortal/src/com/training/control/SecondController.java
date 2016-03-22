package com.training.control;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.domains.HibernateSpringDept;
import com.training.domains.HibernateSpringStudent;
import com.training.entity.Department;
import com.training.entity.Student;

@Controller
public class SecondController {

	Logger log = Logger.getLogger(this.getClass().getName());
	
	@Autowired
	private ModelAndView mdl;
	
	@Autowired
	HibernateSpringDept daoDept;
	
	@Autowired
	HibernateSpringStudent dao;
	
	@RequestMapping(value="/second",method= RequestMethod.GET)
	public ModelAndView init(){

		mdl.setViewName("ViewDetails");
		
		List<Department> deptList = daoDept.findAll();
		
		mdl.addObject("deptList",deptList);
		
		return mdl;
	}
	
	@RequestMapping(value= "/record/{dept}")
	public ModelAndView onSubmit(@PathVariable("dept") String department, Model mdl1) {
		
		List<Student> studentList = dao.findList(department);
		
		//List<Student> studentList1 = findTopper(studentList);
		
		mdl.setViewName("TopStudents");
		mdl.addObject("studentList",studentList);
		
		return mdl;
		
	}
	
	/*public List<Student> findTopper(List<Student> studentList) {
		
		for(int i= 0;i < studentList.size();i++) {
		
			
		}
		
		return null;
	}*/

}
