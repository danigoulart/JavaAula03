package br.com.generation.vetores;

public class VetorEx01 {

	public static void main(String[] args) {
		
		int[] arrayVetor = new int[10];

		arrayVetor[5] = 100;
		
		int numero = 300;
		
		arrayVetor[7] = numero;
		
		for (int i = 0; i <= 9; i++) {

			System.out.println((i + 1) + " º - " + arrayVetor[i]);
		}

	}

}
