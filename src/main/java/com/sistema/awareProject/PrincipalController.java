package com.sistema.awareProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class PrincipalController {

	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/sobre")
	public String sobre() {
		return "sobre";
	}
	
	@GetMapping("/contatos")
	public String contatos() {
		return "contatos";	
	}
	
	@PostMapping("/contatos")
	public String pegaForm() {
		return "sucesso";	
	}

}
