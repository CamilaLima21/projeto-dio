package br.com.dio.aula1;

public class TestaMetodos {

	public static void main(String[] args) {
		
		// Calculadora
		System.out.println("Exerc�cio Calculadora");
		Calculadora.soma(3, 6);
		Calculadora.sub(9, 1.8);
		Calculadora.multi(7, 8);
		Calculadora.div(5, 2.5);
		System.out.println("=================================================");
		
		// Mensagem
		System.out.println("Exerc�cio Mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);
		System.out.println("=================================================");
		
		// Emprestimo
		System.out.println("Exerc�cio Emprestimo");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);		
		System.out.println("=================================================");
	}

}
