package exercicios;

import java.util.Scanner;

public class exercicio_65 {

	public static void main(String[] args) {
		
		// Ler 2 valores, calcular e escrever a soma dos inteiros existentes entre os 2 valores lidos (incluindo 
		// os valores lidos na soma). Considere que o segundo valor lido será sempre maior que o primeiro valor 
	    // lido. 
		
		Scanner scan = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int soma = 0;
		
		System.out.print("Digite o 1° valor: ");
		num1 = scan.nextInt();
		
		System.out.print("Digite o 2° valor: ");
		num2 = scan.nextInt();
		
		while (num2 < num1) {
			System.out.print("O 2° valor tem que ser maior que o 1° \n"
					+ "Digite novamente: ");
			num2 = scan.nextInt();
		}
		
		for (int i = num1; i <= num2; i++) {
			soma += i;
		}
		
		System.out.println("A soma dos números entre o intervalo [" + num1 + ", " + num2 + "] é de " + soma);
		
		scan.close();
	}

}
