package br.com.dio.aula1;

// Classe de exemplo para o exercício da Aula 1 de Métodos

public class Calculadora {

	public static void soma(double n1, double n2) {
		double res = n1 + n2;
		System.out.println("A soma de " + n1 + " + " + n2 + " é = " + res);
	}

	public static void sub(double n1, double n2) {
		double res = n1 - n2;
		System.out.println("A subtração de " + n1 + " - " + n2 + " é = " + res);
	}

	public static void multi(double n1, double n2) {
		double res = n1 * n2;
		System.out.println("A multiplicação de " + n1 + " * " + n2 + " é = " + res);
	}

	public static void div(double n1, double n2) {
		double res = n1 / n2;
		System.out.println("A divisão de " + n1 + " / " + n2 + " é = " + res);
	}
}
