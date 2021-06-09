package com.devapp.todo_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com"})
public class TodoAppApplication {


	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
		System.out.println("Application is running.");
	}

}
