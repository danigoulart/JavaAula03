package br.com.generation.matrizes;

public class ExemploMatriz01 {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[2][4];
		
		notasAlunos[0][0] = 10.0;
		notasAlunos[0][1] = 7.9;
		notasAlunos[0][2] = 6.5;
		notasAlunos[0][3] = 8.5;
		
		notasAlunos[1][0] = 9.0;
		notasAlunos[1][1] = 9.7;
		notasAlunos[1][2] = 5.6;
		notasAlunos[1][3] = 5.8;
		
		for(int l = 0; l < notasAlunos.length; l++) {
			for(int c = 0; c < notasAlunos[1].length; c++) {
				System.out.print(notasAlunos[l][c] + " | ");
			}
			System.out.println();
		} 

	}

}
