package com.sistema.model;

public class RegisterProducts {
	private int id;
	private String nProduc;
	private String nDescricao;
	private String nSelo;
	private String nPontoVenda;
	
	public RegisterProducts() {
		
	}
	
	public RegisterProducts(int id, String nProduc, String nDescricao, String nSelo, String nPontoVenda) {
		this.id = id;
		this.nProduc = nProduc;
		this.nDescricao = nDescricao;
		this.nSelo = nSelo;
		this.nPontoVenda = nPontoVenda;
	}
	
	//Métodos get e set

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getnProduc() {
		return nProduc;
	}

	public void setnProduc(String nProduc) {
		this.nProduc = nProduc;
	}

	public String getnDescricao() {
		return nDescricao;
	}

	public void setnDescricao(String nDescricao) {
		this.nDescricao = nDescricao;
	}

	public String getnSelo() {
		return nSelo;
	}

	public void setnSelo(String nSelo) {
		this.nSelo = nSelo;
	}

	public String getnPontoVenda() {
		return nPontoVenda;
	}

	public void setnPontoVenda(String nPontoVenda) {
		this.nPontoVenda = nPontoVenda;
	}
}