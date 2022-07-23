package br.com.dio.poo;

public class TesteCarro {

	public static void main(String[] args) {
		Carro c1 = new Carro();

		c1.setCor("Azul");
		c1.setModelo("BMW Série 3");
		c1.setCapTanque(59);

		System.out.println(c1.getCor());
		System.out.println(c1.getModelo());
		System.out.println(c1.getCapTanque());
		System.out.println(c1.valTotTanque(6.39));

		Carro c2 = new Carro("Cinza", "Mercedes-Benz Classe C", 66);

		System.out.println(c2.getCor());
		System.out.println(c2.getModelo());
		System.out.println(c2.getCapTanque());
		System.out.println(c2.valTotTanque(6.46));

	}

}
