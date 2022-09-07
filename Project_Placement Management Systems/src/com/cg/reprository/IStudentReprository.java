package com.cg.reprository;

import com.cg.entites.Student;

public interface IStudentReprository {
	//by default all the method are abstract in the Interface 
	 Student addStudent(Student student) ; //Student
	 Student updateStudent(Student student) ; //Student
	 Student searchStudentById(long id); //student 
	 Student searchStudentByHallTicket(long ticketNo); //Student
	 boolean deleteStudent(long id); //boolean
	// user define method
	 public void beginTransaction();//begin the operation of Entity Manager
	 public void commitTransaction();// close an entity manager
}
