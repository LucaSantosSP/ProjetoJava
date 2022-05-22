package com.example.model;

public class Calculadora {
	
	private int n1;
	private int n2;
	
	
	public int somar() {
		return this.getN1()+this.getN2();
	}
	
	public Calculadora(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public int getN1() {
		return n1;
	}

	public int getN2() {
		return n2;
	}

	
	
}
