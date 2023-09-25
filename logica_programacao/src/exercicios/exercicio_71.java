package exercicios;

import java.util.Scanner;
import java.util.Random;

public class exercicio_71 {

	public static void main(String[] args) {
		
		// Faça um algoritmo para ler uma quantidade e a seguir ler esta quantidade de números. Depois de 
		// ler todos os números o algoritmo deve apresentar na tela o maior dos números lidos e a média dos 
		// números lidos. 

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int quant = 0;
		int numero = 0;
		int numMaior = Integer.MIN_VALUE;
		int media = 0;
		int soma = 0;
		
		System.out.print("Digite um número qualquer: ");
		quant = scan.nextInt();
		
		for (int i = 0; i < quant; i++) {
			numero = random.nextInt(100);
			// System.out.println(numero);
			soma += numero;
			
			if (numero > numMaior) {
				numMaior = numero;
			}
		}
		
		media = soma / quant;
		
		System.out.println("O maior número gerado é " + numMaior);
		System.out.println("A média dos números gerados é " + media);
		
		scan.close();
	}

}
