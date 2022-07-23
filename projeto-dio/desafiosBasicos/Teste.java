package br.com.dio.desafiosBasicos;

import java.io.IOException;

//Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws IOException {
		 
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++)
        {
//TODO: complete os espaços em branco com sua solução para o problema
            nomes[i] = input.nextLine();
        }

        int pos = input.nextInt();
        System.out.println(""+ pos);
       
}
}
