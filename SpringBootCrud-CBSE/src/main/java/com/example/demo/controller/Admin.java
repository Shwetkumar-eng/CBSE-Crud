package com.example.demo.controller;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

import jakarta.transaction.Transactional;
@RestController
@RequestMapping("/admin")
public class Admin {

	@Autowired
	StudentRepository repo;
	
	@GetMapping("/add")
	public String add(@RequestParam("name") String name,@RequestParam("hindi") Integer hindi,@RequestParam("eng") Integer eng,@RequestParam("math") Integer math,@RequestParam("chem") Integer chem,@RequestParam("phy") Integer phy) {
		Integer percentage=(hindi+eng+math+chem+phy)/5;
		String status;
		if(percentage>=60)
			status="first division";
		else if(percentage>=50&&percentage<60)
			status="second division";
		else if(percentage>=33&&percentage<50)
			status="third division";
		
		else
			status="fail";
		Student s1=new Student(name,hindi,eng,math,chem,phy,percentage,status);
		repo.save(s1);
		
		
		return name+" record save successfully ";
	} 
    @GetMapping("/ret")	
	public List<Student> ret() {
		 List<Student> students = (List<Student>) repo.findAll(); // Assuming repo.findAll() returns List<Student>

		    return students;
	}
    
    @GetMapping("/del")
    @Transactional
    public String delete(@RequestParam("name") String name,@RequestParam("rollno") Integer rollno) {
    	
    	repo.deleteByNameAndRollno(name, rollno);
    	return name+" record deleted";
    }
	
}
