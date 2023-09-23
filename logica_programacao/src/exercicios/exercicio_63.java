package exercicios;

import java.util.Scanner;

public class exercicio_63 {

	public static void main(String[] args) {
		
		// Escreva um algoritmo para ler 10 números e ao final da leitura escrever a soma total dos 10 
		// números lidos

		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int soma = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "° número: ");
			num = scan.nextInt();
			soma += num;
		}
		
		System.out.println("A soma dos números lidos é " + soma);
		
		scan.close();
	}

}
