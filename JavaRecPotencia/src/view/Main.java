package view;

import controller.PotenciaController;

public class Main {
	public static void main(String[] args) {
	
		PotenciaController potencia = new PotenciaController();
		
		int base = 3;
		int expoente = 5;
		
		int resultado = potencia.potencia(base, expoente);
		
		System.out.println(resultado);
		
	}
}
