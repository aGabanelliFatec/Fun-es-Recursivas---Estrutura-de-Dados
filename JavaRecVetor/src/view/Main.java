package view;

import controller.VetorController;

public class Main {

	public static void main(String[] args) {
		
		VetorController somaVetor = new VetorController();
		
		int[] vetor = {7, 4, 1, 9, 6, 3};
		int tamanho = vetor.length;
		
		int resultado = somaVetor.somaVetor(vetor, tamanho);
		
		System.out.println(resultado);
	}
	
}
