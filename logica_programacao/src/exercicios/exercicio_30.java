package exercicios;

import java.util.Scanner;

public class exercicio_30 {

	public static void main(String[] args) {
		
		// Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem 
		// crescente.
		
		Scanner scan = new Scanner(System.in);
		
		int A;
		int B;
		int C;
		int posicao1 = 0;
		int posicao2 = 0;
		int posicao3 = 0;
		
		System.out.print("Qual o primeiro valor: ");
		A = scan.nextInt();
		
		System.out.print("Qual o segundo valor: ");
		B = scan.nextInt();
		
		System.out.print("Qual o terceiro valor: ");
		C = scan.nextInt();
		
		if (A == B || B == C || A == C) {
			System.out.println("Os valores são iguais, digite novamente!");
		} else {
			if (A < B && A < C) {
				posicao1 = A;
			} else if (B < A && B < C) {
				posicao1 = B;
			} else if (C < A && C < B) {
				posicao1 = C;
			}
			
			if (A < B && A > C || A > B && A < C) {
				posicao2 = A;
			} else if (B < A && B > C || B > A && B < C) {
				posicao2 = B;
			} else if (C < A && C > B || C > A && C < B) {
				posicao2 = C;
			}
			
			if (A > B && A > C) {
				posicao3 = A;
			} else if (B > A && B > C) {
				posicao3 = B;
			} else if (C > A && C > B) {
				posicao3 = C;
			}
			
			System.out.println(posicao1 + ", " + posicao2 + ", " + posicao3);
		}
		
		scan.close();
	}

}
