package br.com.generation.vetores;

import java.util.Scanner;

public class VetorExemplo02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double[] notas = new double[4]; //--> começa em posição 0,1,2,3		
		double soma = 0.0, media = 0.0, x=0; //x vai contar as vezes que gira pra poder calcular a media
		
		System.out.println("Digite às quatro notas do Aluno: ");
		for(int i = 0; i <=3; i++) {
			System.out.println((i+1) + "º Nota: ");
			notas[i] = entrada.nextDouble();
			x++; 
			soma += notas[i];
		}
		media = soma / 4; // podia dividir por (i+1)
		System.out.println("A média do aluno: " + media);
	}

}
