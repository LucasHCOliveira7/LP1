package exercicios;

import java.util.Scanner;

public class exercicio_16 {

	public static void main(String[] args) {
		
		// As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem 
		// compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e 
		// escreva o custo total da compra.

		Scanner leitura = new Scanner(System.in);
		
		double custoMaca = 0.0;
		
		System.out.println("Quantas maçãs serão compradas: ");
		int compraMaca = leitura.nextInt();
		
		if (compraMaca >= 12) {
			custoMaca = compraMaca * 1.0;
			System.out.println("O total da compra foi R$ " + custoMaca);
		} else {
			custoMaca = compraMaca * 1.3;
			System.out.println("O total da compora foi R$ " + custoMaca);
		}
		
		leitura.close();
	}

}
