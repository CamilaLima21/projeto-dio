package br.com.dio.aula1;

public class Emprestimo {

	public static int getDuasParcelas() {
		return 2;
	}
	
	public static int getTresParcelas() {
		return 3;
	}
	
	public static double getTaxaDuasParcelas() {
		return 0.3;
	}
	
	public static double getTaxaTresParcelas() {
		return 0.45;
	}
	
	public static void calcular(double valor, int parcelas) {
		
		if(parcelas == 2) {
			double valFinal = valor + (valor * getTaxaDuasParcelas());
			System.out.println("Valor final do empr�stimo para duas parcelas R$ " + valFinal);
		} else if(parcelas == 3) {
			double valFinal = valor + (valor * getTaxaTresParcelas());
			System.out.println("Valor final do empr�stimo para tr�s parcelas R$ " + valFinal);
		} else {
			System.out.println("Quantidade de parcelas n�o permitida.");
		}
	}
	

}
