package com.sistema.model;

public class RegisterInfos {
	private int id;
	private String nFirstName;
	private String nLastName;
	private String nEmail;
	private String nSenha;
	
	public RegisterInfos() {
		
	}
	
	public RegisterInfos(int id, String nFirstName, String nLastName, String nEmail, String nSenha) {
		this.id = id;
		this.nFirstName = nFirstName;
		this.nLastName = nLastName;
		this.nEmail = nEmail;
		this.nSenha = nSenha;
	}
	
	public String getInfoUsuario() {
		return "ID: " + this.getId() + " | Primeiro nome: " + this.getnFirstName() + " | Último nome: " + this.getnLastName() + " | Email: " + this.getnEmail() 
				+ " | Senha: " + this.getnSenha();
	}
	
	//Métodos get e set

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getnFirstName() {
		return nFirstName;
	}

	public void setnFirstName(String nFirstName) {
		this.nFirstName = nFirstName;
	}

	public String getnLastName() {
		return nLastName;
	}

	public void setnLastName(String nLastName) {
		this.nLastName = nLastName;
	}

	public String getnEmail() {
		return nEmail;
	}

	public void setnEmail(String nEmail) {
		this.nEmail = nEmail;
	}

	public String getnSenha() {
		return nSenha;
	}

	public void setnSenha(String nSenha) {
		this.nSenha = nSenha;
	}


	
}
