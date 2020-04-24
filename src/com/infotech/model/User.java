package com.infotech.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class User {

	@NotEmpty
	@Size(min=6,max=20)
	private String userName;
	
	@NotEmpty
	private String gender;
	
	@NotNull
	@Min(value = 1000000000)
	@Max(value = 9999999999L)
	private Long phone;
	
	@NotEmpty
	private String location;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
