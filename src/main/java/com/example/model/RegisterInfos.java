package com.example.model;

public class RegisterInfos {
	private String nFirstName;
	private String nLastName;
	private String nEmail;
	private String nSenha;
	
	public RegisterInfos(String nFirstName, String nLastName, String nEmail, String nSenha) {
		this.nFirstName = nFirstName;
		this.nLastName = nLastName;
		this.nEmail = nEmail;
		this.nSenha = nSenha;
	}
	
	public String getInfoUsuario() {
		return "Primeiro nome: " + this.getnFirstName() + " | Último nome: " + this.getnLastName() + " | Email: " + this.getnEmail() 
				+ " | Senha: " + this.getnSenha();
	}

	public String getnFirstName() {
		return nFirstName;
	}

	public String getnLastName() {
		return nLastName;
	}

	public String getnEmail() {
		return nEmail;
	}

	public String getnSenha() {
		return nSenha;
	}
	
}
