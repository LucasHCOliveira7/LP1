package exercicios;

import java.util.Scanner;

public class exercicio_83 {

	public static void main(String[] args) {
		
		// Faça um algoritmo para ler 20 números e armazenar em um vetor. Após a leitura total dos 20 
		// números, o algoritmo deve escrever esses 20 números lidos na ordem inversa.

		Scanner scan = new Scanner(System.in);
		
		int[] vetor = new int[20];
		
		for (int i = 0; i < 20; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			vetor[i] = scan.nextInt();
		}
		
		System.out.println("Vetor original:");
		for (int i = 0; i < 20; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		
		int inicio = 0;
		int fim = vetor.length - 1;

		while (inicio < fim) {
		    int temp = vetor[inicio];
		    vetor[inicio] = vetor[fim];
		    vetor[fim] = temp;
		    inicio++;
		    fim--;
		}
		
		System.out.println("Vetor invertido:");
		for (int i = 0; i < 20; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		scan.close();
	}

}
