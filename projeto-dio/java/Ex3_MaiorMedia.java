package br.com.dio.estr.rep.java;

import java.util.Scanner;

/*
Fa�a um programa que leia 5 n�meros
e informe o maior n�mero
e a m�dia desses n�meros.
*/

public class Ex3_MaiorMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int count = 0;
		int maior = 0;
		
		do {
			System.out.println("N�mero: ");
			numero = scan.nextInt();
			if(numero > maior) maior = numero;
			count += 1;
		} while(count < 5);
		
		

	}

}
