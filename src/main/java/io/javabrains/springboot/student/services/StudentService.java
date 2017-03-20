package io.javabrains.springboot.student.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import io.javabrains.springboot.student.Student;

@Service
public class StudentService 
{ 
    private SessionFactory sessionFactory;

    //setter for sessionFactory
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	private List<Student> students=new ArrayList<Student>( Arrays.asList(
			new Student("1","Ajinkya","Shinde","asdsad@gmail.com","Pune","Pune","52.658005","-8.230097"),
			new Student("2","Vipul","More","asdsad@gmail.com","Pune","Pune","54.658005","-8.330097"),
			new Student("3","Pramod","Wagh","asdsad@gmail.com","Pune","Pune","53.658005","-8.430097")
			));
	
	public List<Student> getAllStudents()
	{
		return students;		
	}
	
	public Student getStudentbyid(String id)
	{
		return students.stream().filter(t->t.getSid().equals(id)).findFirst().get();		
	}

	public void addStudent(Student std) 
	{
		students.add(std);
	}

	public void delStudent(String id)
	{
		for(int i=0;i<students.size();i++)
		{	
			if(students.get(i).getSid().equals(id))
			{
				Student s=students.get(i);
				students.remove(s);				
			}
		}
	}

	public void updateStudent(String id, Student std) {
		for(int i=0;i<students.size();i++)
		{
			Student s=students.get(i);
			if(s.getSid().equals(id))
			{
				students.set(i, std);
			}
		}
		
	}
}
