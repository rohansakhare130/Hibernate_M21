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
@Table(name="Student")
public class Student implements Serializable
{
	//Default serialID
	@SuppressWarnings("unused")
	private static final long SerialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	/*@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private College college;*/
	private long roll;
	private String qualification;
	private String course;
	private int year;
	//unidirectional mapping
    @OneToOne(cascade=CascadeType.ALL) //mapping with certificate 1:1
	@JoinColumn(name="Certificate_id") 
	private Certificate Certificate ;
	public Certificate getCertificate() {
		return Certificate;
	}
	public void setCertificate(Certificate certificate) {
		Certificate = certificate;
	}
	private long hallTicketNo;
	
	//Getter and Setter method 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRoll() {
		return roll;
	}
	public void setRoll(long roll) {
		this.roll = roll;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public long getHallTicketNo() {
		return hallTicketNo;
	}
	public void setHallTicketNo(long hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}
		
}