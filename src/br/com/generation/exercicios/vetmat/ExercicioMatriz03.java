package br.com.generation.exercicios.vetmat;

import java.util.Scanner;

public class ExercicioMatriz03 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		Scanner leia = new Scanner(System.in);
		int somaMatriz = 0, somaDiagonal = 0;

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.println("Posição [" + l + "][" + c + "]:");
				matriz[l][c] = leia.nextInt();
				somaMatriz += matriz[l][c];
				
			} System.out.println();
		}
		System.out.println("A soma dos valores na matriz é: " + somaMatriz);
			for(int l=0; l<3; l++) {
				for(int c=0; c<3; c++) {
					if(l==c) {
						somaDiagonal = somaDiagonal + matriz[l][c];
				}
					
			}
		}
			System.out.println("A soma da diagonal principal desta Matriz é de: " + somaDiagonal);
	}

}
