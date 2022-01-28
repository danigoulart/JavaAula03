package br.com.generation.exercicios.vetmat;

import java.util.Random;

/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor com os lan�amentos, 
 * escreva esse vetor. A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m quantas
 *  foram as ocorr�ncias da maior pontua��o. */

public class ExercicioVetor02 {

	public static void main(String[] args) {
		Random sorteio = new Random();

		int[] dado = new int[10];
		int maiorNum = 0, media = 0, vezesJogado = 0;

		System.out.println("Cruzem os dedos, o dado vai girar... \n Os n�meros sorteados foram: ");

		for (int i = 0; i < 10; i++) {
			dado[i] = sorteio.nextInt(5) + 1;
			media = media + dado[i];
			if (dado[i] > maiorNum) {
				maiorNum = dado[i];
			}
			System.out.println();
			System.out.println(i + 1 + "� n�mero sorteado foi: " + dado[i]);
		}
		for (int i = 0; i < 10; i++) {
			if (dado[i] == maiorNum) {
				vezesJogado++;
			}
		}
			System.out.println("___________________________________________________________");
			System.out.println("A m�dia aritm�tica de todos os lan�amentos foi de: " + media / 10);
			System.out.println("___________________________________________________________");
			System.out.println("O maior n�mero foi: " + maiorNum + " e ele foi jogado " + vezesJogado + " vezes!");
		
	}

}
