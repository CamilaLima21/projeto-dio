package br.com.dio.aula2;

public class TestaSobrecarga {

	public static void main(String[] args) {
		
		/// Quadrilatero
		System.out.println("Exercício Quadrilátero");
		Quadrilatero.area(3);
		Quadrilatero.area(5d, 5d);
		Quadrilatero.area(7, 8, 9);
		Quadrilatero.area(5f, 5f);
		System.out.println("=================================================");

	}

}
