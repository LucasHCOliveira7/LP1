package exercicios;

import java.util.Scanner;

public class exercicio_40 {

	public static void main(String[] args) {
		
		// Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço 
		// unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total 
		// a pagar (total a pagar = total - desconto), sabendo-se que: 
		// - Se quantidade <= 5 o desconto será de 2% 
		// - Se quantidade > 5 e quantidade <=10 o desconto será de 3% 
		// - Se quantidade > 10 o desconto será de 5%
		
		Scanner scan = new Scanner(System.in);
		
		String nomeProduto;
		int quantAdquirida;
		double precoProduto;
		double total;
		
		System.out.print("Nome do produto: ");
		nomeProduto = scan.next();
		
		System.out.print("Quantidade adquirida: ");
		quantAdquirida = scan.nextInt();
		
		System.out.print("Preço do produto: ");
		precoProduto = scan.nextDouble();
		
		if (quantAdquirida <= 5) {
			double desconto = 0.98;
			total = (quantAdquirida * precoProduto) * desconto;
			System.out.printf("O valor total a pagar é de R$ %.2f", total);
		} else if (quantAdquirida > 5 && quantAdquirida <= 10) {
			double desconto = 0.97;
			total = (quantAdquirida * precoProduto) * desconto;
			System.out.printf("O valor total a pagar é de R$ %.2f", total);
		} else if (quantAdquirida > 10) {
			double desconto = 0.95;
			total = (quantAdquirida * precoProduto) * desconto;
			System.out.printf("O valor total a pagar é de R$ %.2f", total);
		}
		
		scan.close();
	}

}
