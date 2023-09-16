package exercicios;

import java.util.Scanner;

public class exercicio_26 {

	public static void main(String[] args) {
		
		// Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e 
		// quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade 
		// média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual 
		// a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar 
		// compra'. 

		Scanner leitura = new Scanner(System.in);
		
		int quantAtual;
		int quantMax;
		int quantMin;
		int quantMedia;
		
		System.out.print("Qual a quantidade atual em estoque: ");
		quantAtual = leitura.nextInt();
		
		System.out.print("Qual a quantidade máxima do estoque: ");
		quantMax = leitura.nextInt();
		
		System.out.print("Qual a quantidade mínima em estoque: ");
		quantMin = leitura.nextInt();
		
		quantMedia = (quantMax + quantMin) / 2;
		
		if (quantAtual >= quantMedia) {
			System.out.println("O estoque está acima da média, não precisa efetuar compra!");
		} else {
			System.out.println("O estoque está abaixo da média, necessário efetuar a compra!");
		}
		
		leitura.close();
	}

}
