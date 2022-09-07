package com.cg.service;

import com.cg.entites.Certificate;
import com.cg.entites.Student;

public interface IStudentService {
	//by default all the method are abstract in the Interface 
	Student addStudent(Student student) ; //Student
	Student updateStudent(Student student) ; //Student
	Student searchStudentById(long id); //student 
	Student searchStudentByHallTicket(long ticketNo); //Student
	boolean  addCertificate(Certificate certificate); //Boolean
	boolean updateCertificate(Certificate certificate); // Boolean
	boolean deleteStudent(long id); //boolean
	
}	