package com.iTechies.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="signup")
public class Signup extends BaseEntity {
	
	@Column(name="username")
	private String userName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="data_of_birth")	
	private Date dateOfBirth;
	
	@Column(name="password")
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "signUp_Entity [userName=" + userName + ", email=" + email + ", dateOfBirth=" + dateOfBirth
				+ ", password=" + password + "]";
	}

}
