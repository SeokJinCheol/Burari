package com.project.burari.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name= "USER")
public class UserVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="USER_NAME")
	private String name;
	
	@Column(name="USER_EMAIL", unique=true)
	@Email
	private String email;
	
	@Column(name="USER_SOCIAL_NAME")
	private String socialName;
	
	@Column(name="USER_SOCIAL_ID")
	private String socialId;

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

	public String getSocialName() {
		return socialName;
	}

	public void setSocialName(String socialName) {
		this.socialName = socialName;
	}

	public String getSocialId() {
		return socialId;
	}

	public void setSocialId(String socialId) {
		this.socialId = socialId;
	}

	@Override
	public String toString() {
		return "UserVO [id=" + id + ", name=" + name + ", email=" + email + ", socialName=" + socialName + ", socialId="
				+ socialId + "]";
	}

}
