package exercicios;

import java.util.Scanner;

public class exercicio_53 {

	public static void main(String[] args) {
		
		// Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere 
		// que o N será sempre maior que ZERO.

		Scanner scan = new Scanner(System.in);
		
		int N;
		
		System.out.print("Qual o valor de N: ");
		N = scan.nextInt();
		
		if (N > 0) {
			for (int i = 1; i <= N; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("N tem que ser maior que ZERO! \n"
					+ "Tente novamente.");
		}
		
		scan.close();
	}

}
