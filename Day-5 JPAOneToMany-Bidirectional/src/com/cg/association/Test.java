package com.cg.association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		//create a new department
		Department d = new Department();
		d.setId(10);
		d.setName("Accounting");
		
		Department d1 = new Department();
		d1.setId(11);
		d1.setName("It Manager");
		
		Employee e = new Employee();
		e.setName("Vaibhav");
		e.setSalary(40000);
		e.setDept(d);
		
		Employee e1 = new Employee();
		e1.setName("Rohan");
		e1.setSalary(50000);
		e1.setDept(d1);
		
		em.persist(e);
		em.persist(e1);
		
		System.out.println("Add the Recored");
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}