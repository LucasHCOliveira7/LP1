package exercicios;

import java.util.Scanner;

public class exercicio_89 {

	public static void main(String[] args) {
		
		// Faça um algoritmo para ler dois vetores V1 e V2 de 15 números cada. Calcular e escrever a 
		// quantidade de vezes que V1 e V2 possuem os mesmos números e nas mesmas posições. 

		Scanner scan = new Scanner(System.in);
		
		int[] V1 = new int[15];
		int[] V2 = new int[15];
		
		System.out.println("VETOR V1");
		for (int i = 0; i < 15; i++) {
			System.out.print("Digite o " + (i + 1) + "° valor para o vetor V1: ");
			V1[i] = scan.nextInt();
		}
		
		System.out.println("VETOR V2");
		for (int i = 0; i < 15; i++) {
			System.out.print("Digite o " + (i + 1) + "° valor para o vetor V2: ");
			V2[i] = scan.nextInt();
		}
		
		int cont = 0;
		for (int i = 0; i < 15; i++) {
			if (V1[i] == V2[i]) {
				cont++;
			}
		}
		
		System.out.println("Os vetores V1 e V2 tem " + cont + " valor(es) igual(is)");
		
		scan.close();
	}

}
