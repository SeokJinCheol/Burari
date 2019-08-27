package com.project.burari.vo;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="MENU")
public class MenuVO {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_menu")
	@SequenceGenerator(name="SEQ_menu", sequenceName="SEQ_menu", allocationSize=1)
	private Integer id;
	
	@OneToMany(fetch=FetchType.EAGER, cascade= CascadeType.ALL)
	@JoinColumn(name="create_user")
	private Collection<ProjectVO> project;
	
	@Column
	private String name;
	
	@Column
	private int index;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Collection<ProjectVO> getProject() {
		return project;
	}

	public void setProject(Collection<ProjectVO> project) {
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
