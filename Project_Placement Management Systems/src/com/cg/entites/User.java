package com.cg.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String type;
	private String password;
	// getter and setter method
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
