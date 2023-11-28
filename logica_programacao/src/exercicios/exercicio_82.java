package exercicios;

import java.util.Scanner;

public class exercicio_82 {

	public static void main(String[] args) {
		
		// Ler um vetor A de 10 números. Após, ler mais um número e guardar em uma variável X. 
		// Armazenar em um vetor M o resultado de cada elemento de A multiplicado pelo valor X. Logo após, 
		// imprimir o vetor M.
		
		Scanner scan = new Scanner(System.in);

		int X = 0;
		int[] A = new int[10];
		int[] M = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "° número do vetor A: ");
			A[i] = scan.nextInt();
		}
		
		System.out.println("====================");
		System.out.println("Vetor A");
		for (int cont = 0; cont < 10; cont++) {
			System.out.print(A[cont] + " ");
		}
		System.out.println();
		System.out.println("====================");
		
		System.out.print("Agora digite mais um número: ");
		X = scan.nextInt();
		
		for (int i = 0; i < 10; i++) {
			M[i] = A[i] * X;
		}
		
		System.out.println("====================");
		System.out.println("Vetor M");
		for (int i = 0; i < 10; i++) {
			System.out.print(M[i] + " ");
		}
		System.out.println();
		System.out.println("====================");
		
		scan.close();
	}

}
