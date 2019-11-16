package com.logesh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetUserController {
	@PostMapping("greet")
	public @ResponseBody String greetUser(@ModelAttribute("user") String userName) {
		System.out.println("Request came here!");
		return "Hello "+userName.toUpperCase() + ", Have a nice day !:)";
	}
}
