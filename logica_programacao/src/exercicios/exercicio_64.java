package exercicios;

import java.util.Scanner;

public class exercicio_64 {

	public static void main(String[] args) {
		
		// Escreva um algoritmo para ler 10 números. Todos os números lidos com valor inferior a 40 devem 
		// ser somados. Escreva o valor final da soma efetuada.

		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int soma = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "° número: ");
			num = scan.nextInt();
			
			if (num < 40) {
				soma += num;
			}
		}
		
		System.out.println("A soma dos valores menores que 40 deu " + soma);
		
		scan.close();
	}

}
