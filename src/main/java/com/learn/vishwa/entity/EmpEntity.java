package com.learn.vishwa.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.learn.vishwa.constants.AppConstants;

import lombok.Data;

@Data	
@Entity
@Table(name = AppConstants.EMPLOYEE_INFO)
public class EmpEntity implements Serializable{

	public EmpEntity(Long id, String firstName, String lastName, String empSalary, List<Address> address, Role empRole) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.empSalary = empSalary;
		this.address = address;
		this.empRole = empRole;
	}

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name ="id")
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_Name")
	private String lastName;
	
	@Column(name = "Emp_salary")
	private String empSalary;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_id")
	private List<Address> address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "role_id")
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

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	
	
	
}
