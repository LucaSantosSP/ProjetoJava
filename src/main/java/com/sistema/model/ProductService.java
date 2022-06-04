package com.sistema.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProdutoDAO pdao;
	
	public void inserirProduct(RegisterProducts p) {
		pdao.inserirProd(p);
	}
	
	public Map<String,Object> getProduto(int id){
		return pdao.getProduto(id);
	}
	
	public List<Map<String, Object>> getProdutos(){
		return pdao.getProdutos();
	}
	
	public void deleteProduto(int id) {
		pdao.deleteProduto(id);
	}
	
	public void atualizarProduto(int id, RegisterProducts prod) {
		pdao.atualizarProduto(id, prod);
	}
}
