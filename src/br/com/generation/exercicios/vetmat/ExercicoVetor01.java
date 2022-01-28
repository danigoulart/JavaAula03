package br.com.generation.exercicios.vetmat;

import java.util.Scanner;

//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade e o escreva em seguida. 
//Encontre ap�s a maior pontua��o e a apresente. 

public class ExercicoVetor01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] pontuacao = new int[5];
		int maiorNota = 0;
		
		for (int i = 0; i <= 4; i++) {
		System.out.println("Digite a " + (i+1) + " � Nota: ");
		pontuacao[i] = entrada.nextInt();
		
			if(pontuacao[i] > maiorNota) {
				maiorNota = pontuacao[i];
			}
		
		} System.out.println("A sua maior nota foi: " + maiorNota);
		
		entrada.close();
	}

}
