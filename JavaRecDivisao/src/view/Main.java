package view;

import controller.DivisaoController;

public class Main {

	public static void main(String[] args) {
		DivisaoController divisao = new DivisaoController();
		
		int dividendo = 23;
		int divisor = 4;
		
		int resultado = divisao.divisao(dividendo, divisor);
		
		System.out.println(resultado);
	}
	
}
