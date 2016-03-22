package com.training.domains;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.entity.Student;
import com.training.iface.MyDAO;


public class HibernateSpringStudent extends HibernateDaoSupport implements MyDAO<Student> {

	@Autowired
	private SessionFactory fact;
	
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

	public List<Student> findList(Serializable obj) {

		String hql = "From Student s where s.department =  :arg  order by s.academicScore * .5  + s.sportsScore*.30 + s.culturalScore * .20 DESC";
		
		Query query =  fact.openSession().createQuery(hql);
		query.setString("arg", (String) obj);
		query.setMaxResults(2);
		//List<Student> studentList =  (List<Student>) getHibernateTemplate().find("from Student where department.departmentName = ?",obj);
		List<Student> studentList = query.list();
		return studentList;
		
	}
	
	

}
