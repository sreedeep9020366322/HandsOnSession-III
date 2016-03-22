package com.training.domains;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.entity.Department;
import com.training.iface.MyDAO;

public class HibernateSpringDept extends HibernateDaoSupport implements MyDAO<Department> {

	@Override
	public Serializable add(Department t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department find(Serializable obj) {
		// TODO Auto-generated method stub
		return null;
	} 	

	@Override
	public List<Department> findAll() {

		List<Department> deptList =  (List<Department>) getHibernateTemplate().find("from Department");//(List<Department>) getSession().createSQLQuery("Select * from Department").list();
		
		return deptList;
	}

	@Override
	public boolean update(Department obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Serializable obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
