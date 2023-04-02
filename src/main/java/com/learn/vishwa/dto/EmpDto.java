package com.learn.vishwa.dto;

import java.io.Serializable;

import javax.persistence.Column;

import com.learn.vishwa.entity.Address;
import com.learn.vishwa.entity.Role;

public class EmpDto implements Serializable{

	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private String empSalary;
	
	private Address address;
	
	private Role empRole;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Role getEmpRole() {
		return empRole;
	}

	public void setEmpRole(Role empRole) {
		this.empRole = empRole;
	}

	public String getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
