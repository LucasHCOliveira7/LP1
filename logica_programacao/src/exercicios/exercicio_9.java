package exercicios;

import java.util.Scanner;

public class exercicio_9 {

	public static void main(String[] args) {
		
		// Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. 
		// Calcular e escrever o valor do novo salário.
		
		Scanner leitura = new Scanner(System.in);

		System.out.print("Qual o salário atual do funcionário: R$ ");
		double salarioAtual = leitura.nextDouble();
		
		System.out.print("Qual o percentual de reajuste: ");
		double percentual = leitura.nextDouble();
		
		double reajuste = salarioAtual + ((salarioAtual * percentual) / 100);
		System.out.printf("O valor do salário reajustado é de R$ %.2f", reajuste);
		
	}

}
