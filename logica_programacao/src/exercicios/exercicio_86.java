package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio_86 {

	public static void main(String[] args) {
		
		// Faça um algoritmo para ler 10 números e armazenar em um vetor. Após isto, o algoritmo deve 
		// ordenar os números no vetor em ordem crescente. Escrever o vetor ordenado.

		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			A[i] = scan.nextInt();
		}
		
		System.out.println("Vetor atual:");
		for (int i = 0; i < 10; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(A);
		
		System.out.println("Vetor em ordem crescente:");
		for (int i = 0; i < 10; i++) {
			System.out.print(A[i] + " ");
		}
		
		scan.close();
	}

}
