package com.example.tutorialno2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@Document(collection = "user")
public class User {
	@Id
    private String id;
    private String name;
    private String email;
    private String noAccount;

	public User(String name, String email, String noAccount) {
		super();
		this.name = name;
		this.email = email;
		this.noAccount = noAccount;
	}

}
