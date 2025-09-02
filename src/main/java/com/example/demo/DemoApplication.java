package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	int x=100;
	int y=200;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
