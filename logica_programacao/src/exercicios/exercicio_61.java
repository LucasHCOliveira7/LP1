package exercicios;

import java.util.Scanner;

public class exercicio_61 {

	public static void main(String[] args) {
		
		// Ler 10 valores, calcular e escrever a média aritmética desses valores lidos.

		Scanner scan = new Scanner(System.in);
		
		double num;
		double media = 0;
		double soma = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "° valor: ");
			num = scan.nextInt();
			soma += num;
		}
		
		media = soma / 10;
		System.out.println(media);
		
		scan.close();
	}

}
