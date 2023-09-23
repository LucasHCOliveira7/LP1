package exercicios;

import java.util.Scanner;

public class exercicio_67 {

	public static void main(String[] args) {
		
		// Faça um algoritmo que calcule e escreva a média aritmética dos números inteiros entre 15 
		// (inclusive) e 100 (inclusive). 
		
		int num1 = 15;
		int num2 = 100;
		int soma = 0;
		
		Scanner scan = new Scanner(System.in);

		for (int i = num1; i <= 100; i++) {
			soma += i;
		}
		
		System.out.println("A soma dos números entre o intervalo [" + num1 + ", " + num2 + "] é de " + soma);
		
		scan.close();
	}

}
