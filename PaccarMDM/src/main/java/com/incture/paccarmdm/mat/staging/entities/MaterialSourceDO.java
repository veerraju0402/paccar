package com.incture.paccarmdm.mat.staging.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MATERIAL_SOURCE")
public class MaterialSourceDO implements Serializable{
	public static final long serialVersionUID = 5018420100965861106L;
	
	// common column(s) -- MAT_DESC, MAT_NO 
	
	@Id
	@Column(name = "SRC_ID")
	private Integer source_id;
	
	@Column(name = "MAT_NO", length = 10)
	private String material_number;

	@Column(name = "SRC_NM", length = 20)
	private String source_name;

	@Column(name = "SRC_AUTH")
	private Boolean source_authorize;
	
	@Column(name = "SRC_LOC", length = 10)
	private String source_location;
	
	@Column(name = "SRC_CD", length = 5)
	private String source_code;
	
	@Column(name = "MAT_DESC", length = 30)
	private String material_description;

	public Integer getSource_id() {
		return source_id;
	}

	public void setSource_id(Integer source_id) {
		this.source_id = source_id;
	}

	public String getMaterial_number() {
		return material_number;
	}

	public void setMaterial_number(String material_number) {
		this.material_number = material_number;
	}

	public String getSource_name() {
		return source_name;
	}

	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}

	public Boolean getSource_authorize() {
		return source_authorize;
	}

	public void setSource_authorize(Boolean source_authorize) {
		this.source_authorize = source_authorize;
	}

	public String getSource_location() {
		return source_location;
	}

	public void setSource_location(String source_location) {
		this.source_location = source_location;
	}

	public String getSource_code() {
		return source_code;
	}

	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}

	public String getMaterial_description() {
		return material_description;
	}

	public void setMaterial_description(String material_description) {
		this.material_description = material_description;
	}

	
}
