package com.cg.joinInheritance;

import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name="Manager")
public class Manager extends Employee {
	
	private static final long serialVersionUID=1L;
	
	private String depName;
	public String getdptName()
	{
		return depName;
	}
	public void setDeptName(String depName)
	{
		this.depName=depName;
	}
	
}
