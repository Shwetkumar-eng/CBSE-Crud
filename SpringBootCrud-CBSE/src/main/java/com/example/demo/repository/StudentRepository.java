package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	public Optional<Student> findByNameAndRollno(String name,Integer rollno);
	public void deleteByNameAndRollno(String name,Integer rollno);

}
