package com.cg.entites;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="Certificate")
public class Certificate implements Serializable
{
	@SuppressWarnings("unused")
	private static final long SerialVersionUID=1L;
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private int year;
	@OneToOne(cascade=CascadeType.ALL) //mapping with certificate 1:1
	@JoinColumn(name="Certificate_id")
	//private College college;
	
	// getter and setter method
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}	
	
}