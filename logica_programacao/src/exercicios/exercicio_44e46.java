package exercicios;

import java.util.Scanner;

public class exercicio_44e46 {

	public static void main(String[] args) {
		
		// Exercício 44
		// Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido 
		// um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado 
		// da divisão do primeiro valor lido pelo segundo valor lido. (utilizar a estrutura REPITA).

		// Exercício 46
		// Acrescentar uma mensagem de 'VALOR INVÁLIDO' no exercício [44] caso o segundo valor 
		// informado seja ZERO.
		
		Scanner scan = new Scanner(System.in);

        double valor1;
        double valor2;
        double divisao;

        do {
            System.out.print("Qual o primeiro valor: ");
            valor1 = scan.nextDouble();

            System.out.print("Qual o segundo valor: ");
            valor2 = scan.nextDouble();

            if (valor2 == 0) {
                System.out.println("Valor inválido! O segundo valor não pode ser zero.");
            }
        } while (valor2 == 0);

        divisao = valor1 / valor2;
        System.out.printf("A divisão %.2f / %.2f é igual a %.2f", valor1, valor2, divisao);

        scan.close();
	}

}
