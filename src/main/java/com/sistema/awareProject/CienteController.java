package com.sistema.awareProject;


import com.sistema.model.ClienteService;
import com.sistema.model.RegisterInfos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@ComponentScan("com.sistema.model")
public class CienteController {
	
	ClienteService myClass;
	
	@Autowired
	private ApplicationContext context;
	
	@GetMapping("/register")
	public String formRegister(Model model) {
		model.addAttribute("usuario", new RegisterInfos());
		return "register";
	}
	
	@PostMapping("/register")
	public String inserirUsuario(@ModelAttribute RegisterInfos usuario) {
		ClienteService cs = context.getBean(ClienteService.class);
		cs.inserirCliente(usuario);
		return "sucesso";
		
	}
	
	//-------------------------------------
}
