package br.com.generation.exercicios.vetmat;

import java.util.Random;

public class ExercicioMatriz01 {

	public static void main(String[] args) {
		Random sorteio = new Random();

		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];
		int soma = 0, dif = 0;

		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				N1[l][c] = sorteio.nextInt(100);
				N2[l][c] = sorteio.nextInt(100);
				M1[l][c] = N1[l][c] + N2[l][c];
				M2[l][c] = N1[l][c] - N2[l][c];
				System.out.println("Matriz N1 posição [" + l + "] [" + c + "] {" + N1[l][c] + "}");
				System.out.println("Matriz N2 posição [" + l + "] [" + c + "] {" + N2[l][c] + "}");

			}
			System.out.println("_______________ ");

		}
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				
				System.out.println("Matriz M1 posição [" + l + "] [" + c + "] {" + M1[l][c] + "}");
				System.out.println("Matriz M2 posição [" + l + "] [" + c + "] {" + M2[l][c] + "}");

			}
			System.out.println("_______________ ");
		}
	}

}
