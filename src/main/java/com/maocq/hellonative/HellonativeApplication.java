package com.maocq.hellonative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Set;

@SpringBootApplication
public class HellonativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellonativeApplication.class, args);
	}
}

@RestController
class CustomersHttpController {

	@GetMapping("/customers")
	Collection<Customer> customers() {
		System.out.println(Thread.currentThread().getName());
		return Set.of(new Customer(1, "A"), new Customer(2, "B"), new Customer(3, "C"));
	}

	record Customer(Integer id, String name) { }
}