package com.example.SpringOneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String DOB;
	private String className;
	private String division;
	private String gender;
	
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course course;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	

	public Student(int id, String name, String dOB, String className, String division, String gender) {
		super();
		this.id = id;
		this.name = name;
		DOB = dOB;
		this.className = className;
		this.division = division;
		this.gender = gender;
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", DOB=" + DOB + ", className=" + className + ", division="
				+ division + ", gender=" + gender + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
