package exercicios;

import java.util.Scanner;

public class exercicio_33 {

	public static void main(String[] args) {
		
		//  Ler dois valores e imprimir uma das três mensagens a seguir: 
		// ‘Números iguais’, caso os números sejam iguais 
		// ‘Primeiro é maior’, caso o primeiro seja maior que o segundo; 
		// ‘Segundo maior’, caso o segundo seja maior que o primeiro.

		Scanner scan = new Scanner(System.in);
		
		double A;
		double B;
		
		System.out.print("Qual o 1° valor: ");
		A = scan.nextDouble();
		
		System.out.print("Qual o 2° valor: ");
		B = scan.nextDouble();
		
		if (A == B) {
			System.out.println("Números Iguais!");
		} else if (A > B) {
			System.out.println("O Primeiro é Maior!");
		} else if (B > A) {
			System.out.println("O Segundo é Maior!");
		}
		
		scan.close();
	}

}
