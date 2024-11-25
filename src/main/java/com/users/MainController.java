package com.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/get")
	public String getMsg()
	{
		return "welcome to chinna";
	}
	@GetMapping("/greet")
	public String getGreet()
	{
		return "congratulations";
	}

}
