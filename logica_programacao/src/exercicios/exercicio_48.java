package exercicios;

import java.util.Scanner;

public class exercicio_48 {

	public static void main(String[] args) {
		
		// Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a 
		// média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada 
		// nota.
		
		// Acrescente uma mensagem 'NOVO CÁLCULO (S/N)?' ao final do exercício. Se for 
		// respondido 'S' deve retornar e executar um novo cálculo, caso contrário deverá encerrar o algoritmo.

		Scanner scan = new Scanner(System.in);
		
		double avaliacao1;
		double avaliacao2;
		double media;

		do {
			System.out.print("Qual a nota da primeira avaliação: ");
			avaliacao1 = scan.nextDouble();
		} while (avaliacao1 < 0 || avaliacao1 > 10);
			
		do {
			System.out.print("Qual a nota da segunda avaliação: ");
			avaliacao2 = scan.nextDouble();
		} while (avaliacao2 < 0 || avaliacao2 > 10);
			
		media = (avaliacao1 + avaliacao2) / 2;
			
		System.out.printf("A média do aluno foi %.2f", media);
		
		scan.close();
		
	}

}
