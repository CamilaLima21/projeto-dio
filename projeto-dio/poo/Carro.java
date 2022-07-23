package br.com.dio.poo;

public class Carro {
	String cor;
	String modelo;
	int capTanque;
	
	public Carro() {}

	public Carro(String cor, String modelo, int capTanque) {
		this.cor = cor;
		this.modelo = modelo;
		this.capTanque = capTanque;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapTanque() {
		return capTanque;
	}

	public void setCapTanque(int capTanque) {
		this.capTanque = capTanque;
	}
	
	double valTotTanque(double valCombustivel) {
		return capTanque * valCombustivel;
	}

}
