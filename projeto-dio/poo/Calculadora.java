package br.com.dio.poo;

public class Calculadora implements OperacaoMatematica {

	@Override
	public void soma(double op1, double op2) {
		System.out.println("Soma = " + op1 + op2);
		
	}
	
	@Override
	public void sub(double op1, double op2) {
		System.out.println("Subtração = " + (op1 - op2));
		
	}
	
	@Override
	public void mult(double op1, double op2) {
		System.out.println("Multiplicação = " + (op1 * op2));
		
	}
	
	@Override
	public void div(double op1, double op2) {
		System.out.println("Divisão = " + (op1 / op2));
		
	}
	
}
