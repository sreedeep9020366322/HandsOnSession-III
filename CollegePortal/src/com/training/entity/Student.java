package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private long studentId;
	private String studentName;
	private double academicScore;
	private double sportsScore;
	private double culturalScore;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(long studentId, String studentName, double academicScore, double sportsScore, double culturalScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.academicScore = academicScore;
		this.sportsScore = sportsScore;
		this.culturalScore = culturalScore;
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
