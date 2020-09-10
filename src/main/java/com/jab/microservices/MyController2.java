package com.jab.microservices;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MyController2 {

	private final MyService service;

	@RequestMapping("/greeting")
	public @ResponseBody String greeting() {
		return service.greet();
	}

}
