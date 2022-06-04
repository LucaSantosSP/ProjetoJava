package com.sistema.model;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoDAO {


	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jbdc;
	
	@PostConstruct
	private void initialize() {
		jbdc = new JdbcTemplate(dataSource);
	}
	
	public void inserirProd(RegisterProducts product) {
		String sql = "INSERT INTO produto (nproduc, ndescricao, nselo, npontoVenda)" + " VALUES (?,?,?,?)";
		
		Object[] obj = new Object[4];
		obj[0] = product.getnProduc();
		obj[1] = product.getnDescricao();
		obj[2] = product.getnSelo();
		obj[3] = product.getnPontoVenda();
		jbdc.update(sql, obj);
	}
	
	public Map<String, Object> getProduto(int id){
		String sql = "SELECT * FROM produto WHERE produto.id = ?";
		Object[] obj = new Object[1];
		obj[0] = id;
		return jbdc.queryForMap(sql,obj);
	}
	
	public List<Map<String, Object>> getProdutos(){
		String sql = "SELECT * FROM produto ORDER BY id ASC";
		List<Map<String, Object>> produtos = (List<Map<String, Object>>) jbdc.queryForList(sql);
		return produtos;
	}
	
	public void deleteProduto(int id) {
		String sql = "DELETE FROM produto WHERE id = ?";
		Object[] obj = new Object[1];
		obj[0] = id;
		jbdc.update(sql, obj);
	}
	
	public void atualizarProduto(int id, RegisterProducts prod) {
		String sql = "UPDATE produto SET nproduc = ?, ndescricao = ?, nselo = ?, npontovenda = ? WHERE id = ?";
		Object[] obj = new Object[5];
		obj[0] = prod.getnProduc();
		obj[1] = prod.getnDescricao();
		obj[2] = prod.getnSelo();
		obj[3] = prod.getnPontoVenda();
		obj[4] = id;
		jbdc.update(sql, obj);
	}
}

















