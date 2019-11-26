package com.incture.paccarmdm.mat.staging.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "USER_DATA")
public class UserDataDO {

	public static final long serialVersionUID = 5018420100965861106L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Integer user_id;

	
	@Column(name = "LOGIN_ID", length = 10, unique = true) // "last_name" + "first 2 letters of
											// first_name"
	private String login_id;

	@Column(name = "USER_NM", length = 30)
	private String user_name;

	@Column(name = "USER_EMAIL", length = 30)
	private String user_email;

	@Column(name = "USER_CREATED")
	@JsonFormat(pattern = "yyyy-mm-dd hh:mm:ss")
	private Date user_created_on;

	@Column(name = "IS_ACTIVE")
	private Boolean is_active;

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public Date getUser_created_on() {
		return user_created_on;
	}

	public void setUser_created_on(Date user_created_on) {
		this.user_created_on = user_created_on;
	}

	public Boolean getIs_active() {
		return is_active;
	}

	public void setIs_active(Boolean is_active) {
		this.is_active = is_active;
	}

	
}
