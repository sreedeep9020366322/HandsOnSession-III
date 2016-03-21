package com.training.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private long studentId;
	private String studentName;
	private double academicScore;
	private double sportsScore;
	private double culturalScore;
	
	@Autowired
	private Department department;
	
	
	public Student(long studentId, String studentName, double academicScore, double sportsScore, double culturalScore,
			Department department) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.academicScore = academicScore;
		this.sportsScore = sportsScore;
		this.culturalScore = culturalScore;
		this.department = department;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getAcademicScore() {
		return academicScore;
	}
	public void setAcademicScore(double academicScore) {
		this.academicScore = academicScore;
	}
	public double getSportsScore() {
		return sportsScore;
	}
	public void setSportsScore(double sportsScore) {
		this.sportsScore = sportsScore;
	}
	public double getCulturalScore() {
		return culturalScore;
	}
	public void setCulturalScore(double culturalScore) {
		this.culturalScore = culturalScore;
	}
	
	
}
