package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// spring context file, auto configuration , component scan -> this or sub package
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// running the spring context
		SpringApplication.run(DemoApplication.class, args);
	}

}
