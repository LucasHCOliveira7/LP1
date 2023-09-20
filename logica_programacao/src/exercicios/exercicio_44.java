package exercicios;

import java.util.Scanner;

public class exercicio_44 {

	public static void main(String[] args) {
		
		// Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido 
		// um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado 
		// da divisão do primeiro valor lido pelo segundo valor lido. (utilizar a estrutura REPITA).

		Scanner scan = new Scanner(System.in);
		
		double valor1;
		double valor2;
		double divisao;
		
		System.out.print("Qual o primeiro valor: ");
		valor1 = scan.nextInt();
		
		System.out.print("Qual o segundo valor: ");
		valor2 = scan.nextInt();
		
		do {
			System.out.print("Valor inválido! O segundo valor não pode ser zero. Informe o valor novamente: ");
			valor2 = scan.nextInt();
		} while (valor2 == 0);
		
		divisao = valor1 / valor2;
		System.out.printf("A divisão " + valor1 + " / " + valor2 + " é igual a %.2f", divisao);
		
		scan.close();
	}

}
