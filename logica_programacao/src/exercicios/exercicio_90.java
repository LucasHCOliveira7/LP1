package exercicios;

import java.util.Scanner;
import java.util.Random;

public class exercicio_90 {

	public static void main(String[] args) {
		
		// Faça um algoritmo para ler um vetor de 30 números. Após isto, ler mais um número qualquer, 
		// calcular e escrever quantas vezes esse número aparece no vetor. 
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
	
		int[] vetor = new int[30];
		
		for (int i = 0; i < 30; i++) {
			vetor[i] = random.nextInt(51);
		}
		
		System.out.println("VETOR ALEATÓRIO:");
		for (int i = 0; i < 30; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		
		int N = 0;
		System.out.print("Digite um número para verifivcar se existe no vetor: ");
		N = scan.nextInt();
		
		int cont = 0;
		for (int i = 0; i < 30; i++) {
			if (N == vetor[i]) {
				cont++;
			}
		}
		
		System.out.println("O número " + N + " apareceu " + cont + " vezes no vetor");
		
		scan.close();
	}

}
