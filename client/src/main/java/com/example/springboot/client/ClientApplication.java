package com.example.springboot.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}

@RestController
class ApplicationController {

	@GetMapping
	public String ping(){
		return "PONG-GET";
	}

	@PostMapping
	public String post(){
		return "PONG-GET";
	}
}
