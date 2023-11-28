package exercicios;

import java.util.Scanner;

public class exercicio_84 {

	public static void main(String[] args) {
		
		// Faça um algoritmo para ler um valor N qualquer (que será o tamanho dos vetores). Após, ler dois 
		// vetores A e B (de tamanho N cada um) e depois armazenar em um terceiro vetor Soma a soma dos 
		// elementos do vetor A com os do vetor B (respeitando as mesmas posições) e escrever o vetor Soma. 

		Scanner scan = new Scanner(System.in);
		
		int N = 0;
		
		System.out.print("Digite o número que será o tamanho dos vetores: ");
		N = scan.nextInt();
		
		int[] A = new int[N];
		int[] B = new int[N];
		int[] Soma = new int[N];
		
		// Vetor A
		System.out.println("VETOR A");
		for (int i = 0; i < N; i++) {
			System.out.print("Digite o " + (i + 1) + "° valor do vetor A: ");
			A[i] = scan.nextInt();
		}
		
		// Vetor B
		System.out.println("VETOR B");
		for (int i = 0; i < N; i++) {
			System.out.print("Digite o " + (i + 1) + "° valor do vetor B: ");
			B[i] = scan.nextInt();
		}
		
		// Vetor Soma
		System.out.println("SOMA DOS VETORES A + B:");
		for (int i = 0; i < N; i++) {
			Soma[i] = A[i] + B[i];
			System.out.print(Soma[i] + " ");
		}
		
		scan.close();
	}

}
