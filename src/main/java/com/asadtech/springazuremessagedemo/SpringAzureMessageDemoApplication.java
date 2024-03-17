package com.asadtech.springazuremessagedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class SpringAzureMessageDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureMessageDemoApplication.class, args);
	}
	@GetMapping("/message")
	String message(){
		return "welcome to azure deployment";
	}

	@GetMapping("/fruit-list")
	List<String> listOfFruit(){
		List<String> list = List.of("Banana","Mango","Apple","Orange");
		return list;
	}
}
