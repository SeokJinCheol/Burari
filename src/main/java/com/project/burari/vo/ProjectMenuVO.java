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
@Table(name="PROJECT_MENUS")
public class ProjectMenuVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(targetEntity=ProjectVO.class, fetch=FetchType.EAGER)
	@JoinColumn(name="PROJECT_ID")
	private ProjectVO project;
	
	@Column(name="PROJECT_MENU_NAME")
	private String name;
	
	@Column(name="PROJECT_MENU_INDEX")
	private int index;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProjectVO getProject() {
		return project;
	}

	public void setProject(ProjectVO project) {
		this.project = project;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return "MenuVO [id=" + id + ", project=" + project + ", name=" + name + ", index=" + index + "]";
	}
	
}
