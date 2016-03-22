package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class Department {

	private String departmentName;
	private String departmentHead;
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentHead() {
		return departmentHead;
	}
	public void setDepartmentHead(String departmentHead) {
		this.departmentHead = departmentHead;
	}
	public Department(String departmentName, String departmentHead) {
		super();
		this.departmentName = departmentName;
		this.departmentHead = departmentHead;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", departmentHead=" + departmentHead + "]";
	}
	
	
	
}
