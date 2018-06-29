
package com.restapi.backend.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * @author Sk Saddam Hosan
 */
@Entity
@Table(name="user_info")
public class User {

	@Id
	@GeneratedValue
	private int userId;
	private String name;
	@JsonFormat(shape=JsonFormat.Shape.STRING , pattern="dd/MM/yyyy")
	private Date dob;
	private double salary;
	
	
	public User() {
		super();
	}
	public User(int userId, String name, Date dob, double salary) {
		super();
		this.userId = userId;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
