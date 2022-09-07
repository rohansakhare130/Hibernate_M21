package com.cg.association;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Students implements Serializable 
{
	
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private int StudentId;
	
	@Column(name="Name")
	private String StudentName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Address_Id")
	private Address address;
	
	
	public Students() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public Students(int studentId, String studentName, Address address) {
		super();
		this.StudentId = studentId;
		this.StudentName = studentName;
		this.address = address;
	}

	//Getter and Setter method
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	// to String method
	@Override
	public String toString() {
		return "Students [toString()=" + super.toString() + "]";
	}
		
	
		
}
