package com.cg.service;

import com.cg.entities.Employee;
import com.cg.repository.EmployeeRep;
import com.cg.repository.EmployeeRepImpl;

public class EmployeeServicelmpl  implements EmployeeService
{
	private EmployeeRep dao;
	
	public EmployeeServicelmpl() {
		super();
		dao = new EmployeeRepImpl();
	}

	@Override
	public void addEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public Employee getEmployeeById(int ID) {
		Employee emp = dao.getEmployeeById(ID);
		return emp;
	}

	@Override
	public void removeEmployee(Employee emp) {
		dao.beginTransaction();
		dao.removeEmployee(emp);
		dao.commitTransaction();
		
	}

	
}