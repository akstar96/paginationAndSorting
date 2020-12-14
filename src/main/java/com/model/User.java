package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import com.sun.istack.NotNull;

@Entity
public class User {
	@Id
	@NotNull
private long id;
	@NotNull
private String firstname;
	@NotNull
private String lastname;
	@NotNull
	@Email
	@Pattern(regexp = "a-z{}")
private String email;
private String password;







}
