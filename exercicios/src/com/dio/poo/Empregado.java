package com.dio.poo;

public class Empregado {
	public String nome;
	public int idade;
	public double[] salario = {1575.60, 2100.25, 2342.75};

	public void imprimirDados() {
		System.out.println("NOME DO EMPREGADO: " + this.nome);
		System.out.println("IDADE DO EMPREGADO: " + this.idade);
		System.out.println("SEUS SALÁRIOS SÃO:");

		for(double sal : this.salario) {
			System.out.println("R$ " + sal);
		}
	}

	public void mediaSalarial() {
		double soma = 0;
		for(double sal : this.salario) {
			soma += sal;
		}

		System.out.println("MÉDIA SALARIAL: " + (soma / this.salario.length));
	}
}