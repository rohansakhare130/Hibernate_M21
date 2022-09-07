package com.cg.joinInheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClassPerTableTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em =factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one Employee
		Employee emp= new Employee();
		emp.setName("Rohan");
		emp.setSalary(25000);
		em.persist(emp);
		
		
		/*//Create second Employee
		Employee emp1= new Employee();
		emp1.setName("Krishna");
		emp1.setSalary(45000);
		em.persist(emp1);*/
		
		
		//create one Manager 
		Manager m= new Manager();
		m.setName("Rohan");
		m.setSalary(50000);
		m.setDeptName("IT");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("data is added in database");
		em.close();
		factory.close();
		
		
	}

}