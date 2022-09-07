package com.cg.client;

import com.cg.entities.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeServicelmpl;

public class Client {

	public static void main(String[] args) {
		//Lazy initialization
				EmployeeService service=new EmployeeServicelmpl();
				Employee emp=new Employee();
				
				 //Create operation
				emp.setID(105);
				emp.setName("Ganesh");
				service.addEmployee(emp);
				
				/* //retreive a data
				emp=service.getEmployeeById(103);
				System.out.println("Emp ID: "+emp.getID());
				System.out.println("Emp Name: "+emp.getName());*/
				
				 /*//update a data
				emp=service.getEmployeeById(104);
				emp.setName("Akash");
				service.updateEmployee(emp);*/
				
				
				/* //retreive a data
				emp=service.getEmployeeById(104);
				System.out.println("Emp ID: "+emp.getID());
				System.out.println("Emp NAME: "+emp.getName());*/
			
				/*//delete a data
				emp=service.getEmployeeById(104);
				service.removeEmployee(emp);*/



			}

		}