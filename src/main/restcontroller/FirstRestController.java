package main.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

	@GetMapping("/restExample")
	public String hello() {
		return "Hello from Rest API";
	}
	
}
