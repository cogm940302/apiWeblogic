package com.weblogic.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String name;
	
    
    public User() {
		super();
	}
	public User(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}    
}