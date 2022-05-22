package com.example.AwareStuff;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.Calculadora;
import com.example.model.RegisterInfos;

@Controller
@ComponentScan("com.example.model")
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
	
	//-------------Formulário de registro-------------
	
	@GetMapping("/register")
	public String formRegister(Model model) {
		model.addAttribute("usuario", new RegisterInfos(null, null, null, null));
		return "register";
	}
	
	@PostMapping("/register")
	public String getUsuario(@ModelAttribute RegisterInfos usuario
							,Model model) {
		String infoUser = usuario.getInfoUsuario();
		model.addAttribute("resultado", infoUser);
		return "calcsoma";
		
	}
}
