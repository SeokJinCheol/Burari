package com.project.burari.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PROJECT_MENU_CONTENTS")
public class ProjectMenuContentVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(targetEntity=ProjectMenuVO.class, fetch=FetchType.EAGER)
	@JoinColumn(name="PROJECT_MENU_ID")
	private ProjectMenuVO projectmenu;
	
	@Column(name="PORJECT_MENU_CONTENT_NAME")
	private String name;
	
	@ManyToOne(targetEntity=FieldVO.class, fetch=FetchType.EAGER)
	@JoinColumn(name="PROJECT_MENU_CONTENT_FIELD")
	private FieldVO field;
	
	@Column(name="PORJECT_MENU_CONTENT_DEFAULT")
	public String defaultvalue;
	
	@Column(name="PROJECT_MENU_CONTENT_EXPLANATION")
	public String explanation;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProjectMenuVO getProjectmenu() {
		return projectmenu;
	}

	public void setProjectmenu(ProjectMenuVO projectmenu) {
		this.projectmenu = projectmenu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FieldVO getField() {
		return field;
	}

	public void setField(FieldVO field) {
		this.field = field;
	}

	public String getDefaultvalue() {
		return defaultvalue;
	}

	public void setDefaultvalue(String defaultvalue) {
		this.defaultvalue = defaultvalue;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	@Override
	public String toString() {
		return "ProjectMenuContent [id=" + id + ", projectmenu=" + projectmenu + ", name=" + name + ", field=" + field
				+ ", defaultvalue=" + defaultvalue + ", explanation=" + explanation + "]";
	}
	
}
