package exercicios;

import java.util.Scanner;

public class exercicio_23 {

	public static void main(String[] args) {
		
		// Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule 
		// e mostre seu peso ideal, utilizando as seguintes fórmulas: 
		
		//	 - para sexo masculino: peso ideal = (72.7 * altura) - 58 
		//	 - para sexo feminino: peso ideal = (62.1 * altura) - 44.7
		
		Scanner leitura = new Scanner(System.in);
		
		String nome;
		double altura;
		String sexo;
		double pesoIdeal;
		
		System.out.print("Qual o nome da pessoa: ");
		nome = leitura.next();
		
		System.out.print("Qual a altura da pessoa: ");
		altura = leitura.nextDouble();
		
		System.out.print("Qual o sexo da pessoa [M (masculino) ou F (feminino)]: ");
		sexo = leitura.next();
		
		if (sexo.equals("M") || sexo.equals("m")) {
			pesoIdeal = (72.7 * altura) - 58;
			System.out.printf("O peso ideal para o %s é de %.2f", nome, pesoIdeal);
		} else if (sexo.equals("F") || sexo.equals("f")) {
			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.printf("O peso ideal para a %s é de %.2f", nome, pesoIdeal);
		} else {
			System.out.println("Dados inválidos! Tente novamente.");
		}
		
		leitura.close();
		
	}

}
