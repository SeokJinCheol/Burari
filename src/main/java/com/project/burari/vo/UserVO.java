package com.project.burari.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name= "USER")
public class UserVO {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_user")
	@SequenceGenerator(name="SEQ_user", sequenceName="SEQ_user", allocationSize=1)
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	@Email
	private String email;
	
	@Column
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserVO [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}

}
