package com.cg.association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em =factory.createEntityManager();
		em.getTransaction().begin();
		
		Students s = new Students();
		s.setStudentName("shivani");
		s.setStudentId(21);
		em.merge(s);
		
		Address a = new Address();
		a.setAddressId(11);
		a.setStreet("Ashok Nager");
		a.setState("Maharastra");
		a.setCity("Pune");
		em.persist(a);
		System.out.println("Row no.1 is Inserted"+s);
		
		
		
		
		
		
		//em.persist(a);
		//em.persist(s1);
		
		//System.out.println("Row no.2 is Inserted"+s1);
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}