package com.jab.microservices;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	public String greet() {
		return "Hello, World";
	}
}
