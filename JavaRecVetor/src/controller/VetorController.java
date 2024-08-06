package controller;

public class VetorController {

	public VetorController() {
		super();
	}
	
	public int somaVetor(int[] vetor, int tamanho) {
		if (tamanho == 0) {
			return 0;
		} else {
			int valor = vetor[tamanho-1];
			tamanho--;
			return valor +  somaVetor(vetor, tamanho);
		}
	}
	
}
