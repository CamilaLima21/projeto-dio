package br.com.dio.aula3;

public class TestaRetornos {

	public static void main(String[] args) {
		
		/// Retornos
		System.out.println("=================================================");
		System.out.println("Exerc�cio Retorno");
		double areaQuadrado = Quadrilatero2.area(3);
		System.out.println("�rea do quadrado: " + areaQuadrado);
		double areaRetangulo = Quadrilatero2.area(5, 5);
		System.out.println("�rea do retangulo: " + areaRetangulo);
		double areaTrapezio = Quadrilatero2.area(7, 8, 9);
		System.out.println("�rea do trapezio: " + areaTrapezio);
		
	}

}
