package com.example.library;

import com.example.library.DTO.UserDto;
import com.example.library.model.enums.Role;
import com.example.library.service.UsersService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Bean
	public CommandLineRunner test(UsersService userService) {
		return (args) -> {
			userService.registerNewUserAccount(new UserDto("reader", "654321", Role.READER, "Petrov", "03.03.1992"));
			userService.registerNewUserAccount(new UserDto("editor", "123456", Role.EDITOR, "Ivanov", "02.02.1999"));
		};
	}

}