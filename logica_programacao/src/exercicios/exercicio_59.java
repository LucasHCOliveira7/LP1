package exercicios;

import java.util.Scanner;

public class exercicio_59 {

	public static void main(String[] args) {
		
		// Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS.
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int contadorNegativo = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite um número positivo ou negativo: ");
			num = scan.nextInt();
			
			if (num < 0) {
				contadorNegativo++;
			}
			
		}
		System.out.println("Foi digitado " + contadorNegativo + " número(s) negativo(s)");
		
		scan.close();
	}

}
