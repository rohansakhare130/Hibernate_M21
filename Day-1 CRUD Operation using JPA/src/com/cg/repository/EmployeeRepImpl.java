package com.cg.repository;

import javax.persistence.EntityManager;

import com.cg.entities.Employee;

public class EmployeeRepImpl implements EmployeeRep 
{
	//we are going to use EntityManager method-CRUD
	private EntityManager em;
	
	//default constructor
	public EmployeeRepImpl()
	{
		super();
		em=JPAUtil.getEntityManager();
		
	}

	@Override
	// to add=>persist(obj name);
	public void addEmployee(Employee emp) {
		em.persist(emp);
		
	}

	@Override
	//to update=> merge(objname)
	public void updateEmployee(Employee emp) {
		em.merge(emp);
		
	}

	@Override
	//to retrieve a data=>find(classname,pk);
	public Employee getEmployeeById(int ID) {
		Employee emp=em.find(Employee.class, ID);
		return emp;
	}

	

	@Override
	//to Remove=> remove(objname)
	public void removeEmployee(Employee emp) {
		em.remove(emp);
	}

	@Override
	//Transaction method to start and close the entity manager
	public void commitTransaction() {
		em.getTransaction().commit();
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
	}

	
}