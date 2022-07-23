package br.com.dio.estr.rep.java;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int count = 0;
		int maior = 0;
		
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			if(numero > maior) maior = numero;
			count += 1;
		} while(count < 5);
		
		

	}

}
