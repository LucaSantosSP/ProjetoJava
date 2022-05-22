package com.sistema.awareProject;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sistema.model.Calculadora;

@Controller
@ComponentScan("com.sistema.model")
public class FormController {
	
	@GetMapping("/contatos")
	public String formSoma(Model model) {
		model.addAttribute("calc", new Calculadora(0, 0));
		return "contatos";
	}
	
	@PostMapping("/contatos")
	public String calcularSomar(@ModelAttribute Calculadora calc
								,Model model) {
		int soma = calc.somar();
		model.addAttribute("resultado", soma);
		return "calcsoma";
	}
}
