package exercicios;

import java.util.Scanner;

public class exercicio_68 {

	public static void main(String[] args) {
		
		// Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um algoritmo 
		// que permita a entrada das seguintes informações: a) o número total de mercadorias no estoque; b) o 
	    // valor de cada mercadoria. Ao final imprimir o valor total em estoque e a média de valor das 
	    // mercadorias. 

		Scanner scan = new Scanner(System.in);
		
		int estoqueTotal = 0;
		double valorMercadoria = 0;
		double valorTotal = 0;
		double media = 0;
		
		System.out.print("Número total de mercadoria no estoque: ");
		estoqueTotal = scan.nextInt();
		
		for (int i = 1; i <= estoqueTotal; i++) {
			System.out.print("Qual o valor da " + i + "° mercadoria: R$ ");
			valorMercadoria = scan.nextDouble();
			valorTotal += valorMercadoria;
		}
		
		System.out.printf("O valor total de mercadoria em estoque é R$ %.2f\n", valorTotal);
		
		media = valorTotal / estoqueTotal;
		System.out.printf("A média de valor das mercadorias é de R$ %.2f", media);
		
		scan.close();
	}

}
