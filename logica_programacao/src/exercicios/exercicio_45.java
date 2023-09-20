package exercicios;

import java.util.Scanner;

public class exercicio_45 {

	public static void main(String[] args) {
		
		//  Reescreva o exercício anterior (exercício 44) utilizando a estrutura ENQUANTO.

		Scanner scan = new Scanner(System.in);

		double valor1;
		double valor2;
		double divisao;
		
		System.out.print("Qual o primeiro valor: ");
		valor1 = scan.nextInt();
		
		System.out.print("Qual o segundo valor: ");
		valor2 = scan.nextInt();
		
		while (valor2 == 0) {
			System.out.print("Valor inválido! O segundo valor não pode ser zero. Informe o valor novamente: ");
			valor2 = scan.nextInt();
			}
		
		divisao = valor1 / valor2;
		System.out.printf("A divisão " + valor1 + " / " + valor2 + " é igual a %.2f", divisao);
		
		scan.close();
		
	}

}
