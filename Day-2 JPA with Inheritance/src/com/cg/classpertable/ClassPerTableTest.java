package com.cg.classpertable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClassPerTableTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		EmployeeN employee = new EmployeeN();
		employee.setName("John");
		employee.setSalary(5000);
		em.persist(employee);
		
		//create one manager
		ManagerN manager = new ManagerN();
		manager.setName("Trisha");
		manager.setSalary(8000);
		manager.setDeptName("Sales");
		em.persist(manager);
		
		
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();
	}

}