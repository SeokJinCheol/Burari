package com.project.burari.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PROJECT_MEMBERS")
public class ProjectMemberVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(targetEntity=UserVO.class, fetch=FetchType.EAGER)
	@JoinColumn(name="USER_ID")
	private UserVO user;
	
	@ManyToOne(targetEntity=ProjectVO.class, fetch=FetchType.EAGER)
	@JoinColumn(name="PROJECT_ID")
	private ProjectVO project;
	
	@Column(name="MEMBER_ROLE")
	private String Role;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
		this.user = user;
	}

	public ProjectVO getProject() {
		return project;
	}

	public void setProject(ProjectVO project) {
		this.project = project;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", user=" + user + ", project=" + project + ", Role=" + Role + "]";
	}
	
}
