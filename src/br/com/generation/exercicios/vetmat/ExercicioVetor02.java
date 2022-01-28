package br.com.generation.exercicios.vetmat;

import java.util.Random;

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, 
 * escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas
 *  foram as ocorrências da maior pontuação. */

public class ExercicioVetor02 {

	public static void main(String[] args) {
		Random sorteio = new Random();

		int[] dado = new int[10];
		int maiorNum = 0, media = 0, vezesJogado = 0;

		System.out.println("Cruzem os dedos, o dado vai girar... \n Os números sorteados foram: ");

		for (int i = 0; i < 10; i++) {
			dado[i] = sorteio.nextInt(5) + 1;
			media = media + dado[i];
			if (dado[i] > maiorNum) {
				maiorNum = dado[i];
			}
			System.out.println();
			System.out.println(i + 1 + "º número sorteado foi: " + dado[i]);
		}
		for (int i = 0; i < 10; i++) {
			if (dado[i] == maiorNum) {
				vezesJogado++;
			}
		}
			System.out.println("___________________________________________________________");
			System.out.println("A média aritmética de todos os lançamentos foi de: " + media / 10);
			System.out.println("___________________________________________________________");
			System.out.println("O maior número foi: " + maiorNum + " e ele foi jogado " + vezesJogado + " vezes!");
		
	}

}
