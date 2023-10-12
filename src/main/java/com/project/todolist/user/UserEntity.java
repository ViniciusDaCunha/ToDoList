package com.project.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="tb_users")
public class UserEntity {
	
	@Id
	@GeneratedValue(generator = "UUID")
	private UUID id;

	@Column(unique = true)
	public String userName;
	public String name;
	public String password;
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	public UserEntity(String userName, String name, String password) {
		this.userName = userName;
		this.name = name;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
