package com.example.googlejibdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoogleJibDemoApplication {

	@GetMapping("/welcome")
	public String Welcome(){
		return "Welcome to jib";
	}

	public static void main(String[] args) {
		SpringApplication.run(GoogleJibDemoApplication.class, args);
	}

}
