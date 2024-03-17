package com.asadtech.springazuremessagedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
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

	@GetMapping("/list2")
	String listOfFruit(){
		List<String> list = new ArrayList<>();
		list.add("Banana");
		list.add("Mango");
		list.add("Apple");
		list.add("Orange");
		return list.toString();
	}
	@GetMapping("/list")
	String listOfFruit1(){
		return "list-of-fruit";
	}
}
