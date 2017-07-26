package com.spring.model;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User {
	
    private int id;
    private String username;
    
    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String password;
    private String email;
 
    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    public int getId() {
        return id;
    }
 
   
 
}