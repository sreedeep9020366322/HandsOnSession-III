package com.training.domains;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.entity.Student;
import com.training.iface.MyDAO;


public class HibernateSpringStudent extends HibernateDaoSupport implements MyDAO<Student> {

	@Override
	public Serializable add(Student t) {
	
		Serializable key = getHibernateTemplate().save(t);
		return key;
	}

	@Override
	public Student find(Serializable obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() {

		return null;
	}

	@Override
	public boolean update(Student obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Serializable obj) {
		// TODO Auto-generated method stub
		return false;
	}

	
	

}
