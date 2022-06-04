package com.sistema.awareProject;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sistema.model.ProductService;
import com.sistema.model.RegisterProducts;

@Controller
@ComponentScan("com.sistema.model")
public class ProdutoController {

	ProductService myClass;
	
	@Autowired
	private ApplicationContext context;
	
	@GetMapping("/registerproduct")
	public String registerproduct(Model model) {
		model.addAttribute("product", new RegisterProducts());
		return "registerproduct";
	}
	
	@PostMapping("/registerproduct")
	public String inserirProduto(@ModelAttribute RegisterProducts product) {
		ProductService cs = context.getBean(ProductService.class);
		cs.inserirProduct(product);
		return "sucesso";	
	}
	
	@GetMapping("/produto/{id}")
	public String getProduto(@PathVariable("id") int id,
							Model model) {
		ProductService cs = context.getBean(ProductService.class);
		Map<String,Object> mapa = cs.getProduto(id);
		model.addAttribute("nproduc", mapa.get("nproduc"));
		model.addAttribute("ndescricao", mapa.get("ndescricao"));
		model.addAttribute("nselo", mapa.get("nselo"));
		model.addAttribute("npontovenda", mapa.get("npontovenda"));
		return "produto";
	}
	
	@GetMapping("/produtos")
	public String listar(Model model) {
		ProductService pdao = context.getBean(ProductService.class);
		List<Map<String,Object>> produtos = pdao.getProdutos();
		model.addAttribute("produtos",produtos);
		return "produtos";
	}
	
	@PostMapping("/apagar/produto/{id}")
	public String apagarProduto(@PathVariable("id") int id) {
		ProductService pdao = context.getBean(ProductService.class);
		pdao.deleteProduto(id);
		return "redirect:/produtos";
	}
	
	@GetMapping("/upd/{id}")
	public String produtoAtualizar(@PathVariable("id") int id, Model model) {
		ProductService pdao = context.getBean(ProductService.class);
		Map<String, Object> regs = pdao.getProduto(id);
		RegisterProducts prod = new RegisterProducts(id, regs.get("nProduc").toString(), regs.get("nDescricao").toString(), regs.get("nSelo").toString(), regs.get("nPontoVenda").toString());
		model.addAttribute("produto", prod);
		model.addAttribute("id", id);
		return "editarprod";
	}
	
	@PostMapping("/upd/{id}")
	public String atualizarProduto(@PathVariable("id") int id,
									Model model, @ModelAttribute RegisterProducts prod) {
		ProductService pdao = context.getBean(ProductService.class);
		pdao.atualizarProduto(id, prod);
		return "redirect:/produtos";
	}
	
}










