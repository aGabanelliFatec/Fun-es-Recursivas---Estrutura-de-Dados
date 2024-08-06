package controller;

public class PotenciaController {
	
	//construtor de classe, posso passar os parâmetros da classe
	public PotenciaController() {
		super();
	}
	
	public int potencia(int base, int expoente) {
		
//		if(expoente == 0) {
//			return 1;
//		}
//		else{
//			expoente--;
//			return base * potencia(base, expoente);
//		}
		
		while(expoente != 0) {
			expoente--;
			return base * potencia(base, expoente);
		}
		return 1;
		
	}
	
}
