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
@Table(name= "DYSON")
public class DysonVO {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_dyson")
	@SequenceGenerator(name="SEQ_dyson", sequenceName="SEQ_dyson", allocationSize=1)
	private Integer id;
	
	@Column // 제목
	private String title;
	
	@Column // 내용
	private String content;

	@Column	// 중요도
	private String importFlag;
	
	@Column // 작성일
	private String optime;
	
	@Column // 작성자 코드
	private String opmanCode;
	
	@Column // 수정일
	private String optime2;
	
	@Column // 수정자 코드
	private String opmanCode2;
	
	@Column // 삭제여부
	private String deleteFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImportFlag() {
		return importFlag;
	}

	public void setImportFlag(String importFlag) {
		this.importFlag = importFlag;
	}

	public String getOptime() {
		return optime;
	}

	public void setOptime(String optime) {
		this.optime = optime;
	}

	public String getOpmanCode() {
		return opmanCode;
	}

	public void setOpmanCode(String opmanCode) {
		this.opmanCode = opmanCode;
	}

	public String getOptime2() {
		return optime2;
	}

	public void setOptime2(String optime2) {
		this.optime2 = optime2;
	}

	public String getOpmanCode2() {
		return opmanCode2;
	}

	public void setOpmanCode2(String opmanCode2) {
		this.opmanCode2 = opmanCode2;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	@Override
	public String toString() {
		return "DysonVO [id=" + id 
					+ ", title=" + title 
					+ ", content=" + content 
					+ ", importFlag=" + importFlag 
					+ ", optime=" + optime
					+ ", opmanCode=" + opmanCode
					+ ", optime2=" + optime2
					+ ", opmanCode2=" + opmanCode2
					+ ", deleteFlag=" + deleteFlag
				+ "]";
	}
}
