package exercicios;

import java.util.Arrays;
import java.util.Random;

public class exercicio_70 {

	public static void main(String[] args) {
		
		// Faça um programa que leia 100 valores e no final, escreva o maior e o menor valor lido.
		
		Random random = new Random();
		
		int numero = 0;
		int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

		for (int i = 0; i <= 100; i++) {
			numero = random.nextInt(1000);
			
			if (numero > maior) {
	            maior = numero;
	        }
	        
	        if (numero < menor) {
	            menor = numero;
	        }
	        
		}
	
		System.out.println("O maior número gerado é " + maior);
		System.out.println("O menor número gerado é " + menor);
		
	}

}
