package com.project.burari.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="FIELDS")
public class FieldVO {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_FIELDS")
	@SequenceGenerator(name="SEQ_FIELDS", sequenceName="SEQ_FIELDS", allocationSize=1)
	private Integer id;
	
	@Column(name="FIELD_NAME")
	private String name;
	
	@Column(name="FIELD_TYPE")
	private String type;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "FieldVO [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	
	
}
