package exercicios;

import java.util.Scanner;

public class exercicio_45e47 {

	public static void main(String[] args) {
		
		// Exercício 45
		//  Reescreva o exercício anterior (exercício 44) utilizando a estrutura ENQUANTO.
		
		// Exercício 47
		// Acrescentar uma mensagem de 'VALOR INVÁLIDO' no exercício [45] caso o segundo valor 
		// informado seja ZERO. 

		Scanner scan = new Scanner(System.in);

        double valor1;
        double valor2;
        double divisao;

        System.out.print("Qual o primeiro valor: ");
        valor1 = scan.nextDouble();

        System.out.print("Qual o segundo valor: ");
        valor2 = scan.nextDouble();

        while (valor2 == 0) {
            System.out.println("VALOR INVÁLIDO! O segundo valor não pode ser zero.");

            System.out.print("Informe o segundo valor novamente: ");
            valor2 = scan.nextDouble();
        }

        divisao = valor1 / valor2;
        System.out.printf("A divisão %.2f / %.2f é igual a %.2f", valor1, valor2, divisao);

        scan.close();
	}

}
