package exercicios;

import java.util.Scanner;

public class exercicio_69 {

	public static void main(String[] args) {
		
		// O mesmo exercício anterior (exercício 68), mas agora não será informado o número de mercadorias em estoque. 
		// Então o funcionamento deverá ser da seguinte forma: ler o valor da mercadoria e perguntar ‘MAIS 
		// MERCADORIAS (S/N)?’. Ao final, imprimir o valor total em estoque e a média de valor das 
		// mercadorias em estoque.

		Scanner scan = new Scanner(System.in);
		
		double valorTotal = 0;
		int quantidadeMercadorias = 0;
		
		System.out.print("ADICIONAR MERCADORIA? [S/N] ");
		String add = scan.next();
		
		if (add.equalsIgnoreCase("S")) {
			while (true) {
				
				System.out.print("Qual o valor da mercadoria: R$ ");
				double valorMercadoria = scan.nextDouble();
				
				valorTotal += valorMercadoria;
				quantidadeMercadorias++;
				
				System.out.print("ADICIONAR NOVA MERCADORIA? [S/N] ");
				add = scan.next();
				
				if (add.equalsIgnoreCase("N")) {
					break;
				}
			}
		}
		
		if (quantidadeMercadorias > 0) {
			System.out.printf("O valor total de mercadoria em estoque é R$ %.2f\n", valorTotal);
			
			double media = valorTotal / quantidadeMercadorias;
			System.out.printf("A média de valor das mercadorias é de R$ %.2f", media);
		} else {
			System.out.println("Nenhuma mercadoria foi adicionada!");
		}
		
		scan.close();
	}

}
