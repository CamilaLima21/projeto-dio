package br.com.dio.aula1;

// Classe de exemplo para o exerc�cio da Aula 1 de M�todos

public class Calculadora {

	public static void soma(double n1, double n2) {
		double res = n1 + n2;
		System.out.println("A soma de " + n1 + " + " + n2 + " � = " + res);
	}

	public static void sub(double n1, double n2) {
		double res = n1 - n2;
		System.out.println("A subtra��o de " + n1 + " - " + n2 + " � = " + res);
	}

	public static void multi(double n1, double n2) {
		double res = n1 * n2;
		System.out.println("A multiplica��o de " + n1 + " * " + n2 + " � = " + res);
	}

	public static void div(double n1, double n2) {
		double res = n1 / n2;
		System.out.println("A divis�o de " + n1 + " / " + n2 + " � = " + res);
	}
}
