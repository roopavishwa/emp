package com.learn.vishwa.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.learn.vishwa.constants.AppConstants;

@Entity
@Table(name = AppConstants.ADDRESS)
public class Address implements Serializable{

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private Long id;
	
	@Column(name = "street_line")
	private String streetLine;
	
	@Column(name = "town")
	private String town;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreetLine() {
		return streetLine;
	}

	public void setStreetLine(String streetLine) {
		this.streetLine = streetLine;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
}
