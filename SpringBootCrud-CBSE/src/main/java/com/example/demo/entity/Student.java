package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cbsestudent")
public class Student {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rollno;
	private String name;
	private Integer hindi;
	private Integer english;
	private Integer math;
	private Integer chemistry;
	private Integer physics;
	private Integer percentage;
	private String status;
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHindi() {
		return hindi;
	}
	public void setHindi(Integer hindi) {
		this.hindi = hindi;
	}
	public Integer getEnglish() {
		return english;
	}
	public void setEnglish(Integer english) {
		this.english = english;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}
	public Integer getChemistry() {
		return chemistry;
	}
	public void setChemistry(Integer chemistry) {
		this.chemistry = chemistry;
	}
	public Integer getPhysics() {
		return physics;
	}
	public void setPhysics(Integer physics) {
		this.physics = physics;
	}
	public Integer getPercentage() {
		return percentage;
	}
	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Student(String name, Integer hindi, Integer english, Integer math, Integer chemistry, Integer physics,
			Integer percentage, String status) {
		super();
		this.name = name;
		this.hindi = hindi;
		this.english = english;
		this.math = math;
		this.chemistry = chemistry;
		this.physics = physics;
		this.percentage = percentage;
		this.status = status;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
