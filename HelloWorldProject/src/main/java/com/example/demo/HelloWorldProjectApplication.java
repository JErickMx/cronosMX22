package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldProjectApplication {

		
	public static void main(String[] args) {
		System.out.println("Hello World from Spring boot");
		SpringApplication.run(HelloWorldProjectApplication.class, args);
	}

}
