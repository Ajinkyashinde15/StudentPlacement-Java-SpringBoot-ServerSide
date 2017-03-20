package io.javabrains.springboot.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springboot.student.Student;
import io.javabrains.springboot.student.dao.StudentRepository;
import io.javabrains.springboot.student.services.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	private StudentRepository stdrep;

	@Autowired
	private StudentService studentservice;
	
	@RequestMapping("/student")
	public List<Student> sayHi()
	{
		//return studentservice.getAllStudents();
		return stdrep.findAll();
	} 
	
	//http://localhost:8080/student/1
	@RequestMapping(method=RequestMethod.GET,value="/student/{id}")
	public List<Student> getStudent(@PathVariable String id)
	{
		List<Student> std=new ArrayList<Student>(); 
		std.add(stdrep.findBySid(id));
		return std;
		//return studentservice.getStudentbyid(id);
	} 

	@RequestMapping(method=RequestMethod.POST, value="/student/add")
	public void addStudent(@RequestBody Student std)	
	{
		studentservice.addStudent(std);
	} 

	@RequestMapping(method=RequestMethod.DELETE, value="/student/{id}")
	public void addStudent(@PathVariable String id)	
	{
		studentservice.delStudent(id);
	} 

	@RequestMapping(method=RequestMethod.PUT, value="/student/{id}")
	public void UupdateStudent(@RequestBody Student std,@PathVariable String id)	
	{
		studentservice.updateStudent(id, std);
	} 
}
