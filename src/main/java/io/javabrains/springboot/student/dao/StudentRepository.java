package io.javabrains.springboot.student.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.javabrains.springboot.student.Student;

@Transactional
@Repository
public interface StudentRepository extends CrudRepository<Student,String>
{ 
	
	//getStudent();
	public List<Student> findAll();
	public Student findBySid(String sid);
	
}
