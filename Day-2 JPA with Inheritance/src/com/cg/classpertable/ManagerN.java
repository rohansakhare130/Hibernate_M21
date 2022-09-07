package com.cg.classpertable;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table

public class ManagerN extends EmployeeN {
	private static final long serialVersionUID=1L;
	private String deptName;
	public String getdptName()
	{
		return deptName;
	}
	public void setDeptName(String deptName)
	{
		this.deptName=deptName;
	}
	
}