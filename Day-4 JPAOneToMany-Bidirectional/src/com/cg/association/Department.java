package com.cg.association;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department1")
public class Department 
{
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String name;
	
	/*@OneToMany(mappedBy="department")
	private Set <Employee> employee;*/
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}