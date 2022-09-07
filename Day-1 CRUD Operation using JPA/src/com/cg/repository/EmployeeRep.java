package com.cg.repository;

import com.cg.entities.Employee;

public interface EmployeeRep {
	//by default all the method are abstract in the interface 
		void addEmployee(Employee emp);//Creation
		void updateEmployee(Employee emp);//updation
		Employee getEmployeeById(int ID);//Retrieve
		void removeEmployee(Employee emp);//delete
		
		void commitTransaction();// close an entity manager
		void beginTransaction();//begin the operation of Entity Manager
		
	}