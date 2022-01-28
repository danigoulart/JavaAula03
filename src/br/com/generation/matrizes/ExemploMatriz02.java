package br.com.generation.matrizes;

import java.util.Scanner;

public class ExemploMatriz02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double[][] notasAlunos = new double[2][4];
		System.out.println("===Notas dos Alunos===");
		
		for(int l = 0; l < notasAlunos.length; l++) {
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.printf("Digite as Notas: [%d] [%d]: " , l, c);
				notasAlunos[l][c] = leia.nextDouble();
			}
			System.out.println();
		}
		
		for(int l = 0; l < notasAlunos.length; l++) {
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.printf(notasAlunos[l][c] + "|");
			}
		} System.out.println();
		
		
	}

}
