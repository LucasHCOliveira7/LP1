package exercicios;

import java.util.Scanner;

public class exercicio_17 {

	public static void main(String[] args) {
		
		// Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever 
		// uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o 
		// aluno é aprovado). Escrever também a média calculada. 

		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Nota da 1ª Avaliação: ");
		double nota1 = leitura.nextDouble();
		
		System.out.print("Nota da 2ª Avaliação: ");
		double nota2 = leitura.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 6.0) {
			System.out.println("A média do aluno foi " + media);
			System.out.println("O aluno foi APROVADO!");
		} else {
			System.out.println("A média do aluno foi " + media);
			System.out.println("O aluno foi REPROVADO!");
		}
		
		leitura.close();
	}

}
