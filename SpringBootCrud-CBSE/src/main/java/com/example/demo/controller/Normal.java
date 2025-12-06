package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@RestController
public class Normal {

	@Autowired
	StudentRepository repo;
	
	@GetMapping("/user")
	public Student user(@RequestParam("name") String name,@RequestParam("rollno") Integer rollno) {
		
		Optional<Student> option=repo.findByNameAndRollno(name, rollno);
		Student s1=option.get();
		return s1;
	}

	
	@GetMapping("/update")
	public String update(@RequestParam String name,@RequestParam Integer rollno,@RequestParam String namee) {
		
		Optional<Student> option=repo.findByNameAndRollno(name, rollno);
		Student s1=option.get();
		s1.setName(namee);
		repo.save(s1);
		return "your name is updated successfully";
	}

	
}
