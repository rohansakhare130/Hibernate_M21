package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="employee")
//Employee is an entity
public class Employee implements Serializable
{
	
	@SuppressWarnings("unused")
	private static final long SerialVersionUID=1L;
	@Id
	private int ID;
	private String Name;
	//getters and setters method
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
}
