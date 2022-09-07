package com.cg.joinInheritance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Table")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) //This annotation must be written only on parent class


public class Employee implements Serializable 
{
	private static final long serialVersionUID=1L;
	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	private String Name;
	private double salary;
	//getter and Setter method
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name2) {
		this.Name = name2;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	} 
	
}
