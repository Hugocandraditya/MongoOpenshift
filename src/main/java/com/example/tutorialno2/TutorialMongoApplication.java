package com.example.tutorialno2;

import com.example.tutorialno2.model.User;
import com.example.tutorialno2.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories
public class TutorialMongoApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public TutorialMongoApplication(UserService userService) {
		super();
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(TutorialMongoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		userService.addUser(new User("Hugo", "hugo@mail", "11111"));
	}
}
