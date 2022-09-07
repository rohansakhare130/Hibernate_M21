package com.cg.service;

import com.cg.entites.Certificate;
import com.cg.entites.Student;
import com.cg.reprository.ICertificateRepositoryImpl;
import com.cg.reprository.IStudentRepositoryImpl;
import com.cg.reprository.IStudentReprository;
import com.cg.reprository.IcertificateRepository;

public class IStudentServiceImp implements IStudentService
{
	// 1: connection between Service and Repository
		private IStudentReprository st;
		private IcertificateRepository ce;
		
			
		
		//default constructor
		public IStudentServiceImp()
		{
			super();
			st = new IStudentRepositoryImpl();
		   ce = new ICertificateRepositoryImpl();
		   
		}
		//2: IStudentServiceImp  is  Add unimplemented method
		@Override
		public Student addStudent(Student student) {
			st.beginTransaction();
			st.addStudent(student);
			st.commitTransaction();
			return student;
		}
		@Override
		public Student updateStudent(Student student) {
			st.beginTransaction();
			st.updateStudent(student);
			st.commitTransaction();
			return student;
		}
		@Override
		public Student searchStudentById(long id) {
			//st.beginTransaction();
			Student Student = st.searchStudentById(id);
			//st.commitTransaction();
			return Student;
		}
		@Override
		public Student searchStudentByHallTicket(long ticketNo) {
			//st.beginTransaction();
			Student Student = st.searchStudentByHallTicket(ticketNo);
			//st.commitTransaction();
			return Student;
		}
		@Override
		public boolean addCertificate(Certificate certificate) {
			st.beginTransaction();
			ce.addCertificate(certificate);
			st.commitTransaction();
			return true;
		}
		@Override
		public boolean updateCertificate(Certificate certificate) {
			st.beginTransaction();
		    ce.updateCertificate(certificate);
			st.commitTransaction();
			return true;
		}
		@Override
		public boolean deleteStudent(long id) {
			st.beginTransaction();
			boolean b = st.deleteStudent(id);
			st.commitTransaction();
			return b;
		}
		
}