package com.example.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner test(UsersService userService) {
//		return (args) -> {
//			// save users for test
//			userService.registerNewUserAccount(new UserDto("editor", "123456", Role.EDITOR, "Ivanov"));
//		};
//	}

}