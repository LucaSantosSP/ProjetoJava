package com.example.AwareStuff;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {

	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/produtos")
	public String produtos() {
		return "produtos";
	}
	
	@GetMapping("/sobre")
	public String sobre() {
		return "sobre";
	}
	
	/*@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/contatos")
	public String contatos() {
		return "contatos";
	}*/

}
