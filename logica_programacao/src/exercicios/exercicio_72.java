package exercicios;

import java.util.Scanner;

public class exercicio_72 {

	public static void main(String[] args) {
		
		// Faça um algoritmo para ler o código e o preço de 15 produtos, calcular e escrever: 
		// - o maior preço lido 
		// - a média aritmética dos preços dos produtos

		Scanner scan = new Scanner(System.in);
		
		int codigo = 0;
		double preco = 0;
		double soma = 0;
		double media = 0;
		double maiorPreco = Integer.MIN_VALUE;
		
		for (int i = 1; i <= 15; i++) {
			
			System.out.print("Digite o código do " + i +"° produto: ");
			codigo = scan.nextInt();
			
			System.out.print("Digite o preço do " + i + "° produto: R$ ");
			preco = scan.nextDouble();
			
			soma += preco;
			
			if (preco > maiorPreco) {
				maiorPreco = preco;
			}
			
		}
		
		System.out.println("");
		
		System.out.println("O maior valor lido é R$ " + maiorPreco);
		
		media = soma / 15;
		System.out.printf("A média do valor dos preços é %.2f", media);
		
		scan.close();
	}

}
