package exercicios;

import java.util.Scanner;

public class exercicio_41 {

	public static void main(String[] args) {
		
		// Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos 
		// exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo 
		// e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo: 
		
		//                            N1 + N2 * 2 + N3 * 3 + Média_dos_Exercícios
		// Média_de_Aproveitamento = ---------------------------------------------
		//                                                7 
		
		// A atribuição de conceitos obedece a tabela abaixo: 
		// | Média de Aproveitamento | Conceito | 
		// |         >= 9,0          |     A    |
		// |     >= 7,5 e < 9,0      |     B    |
		// |     >= 6,0 e < 7,5      |     C    |
		// |          < 6,0          |     D    |

		Scanner scan = new Scanner(System.in);
		
		double N1;
		double N2;
		double N3;
		double mediaEx;
		double mediaAproveitamento;
		
		System.out.print("Qual a N1 do aluno: ");
		N1 = scan.nextDouble();
		
		System.out.print("Qual a N2 do aluno: ");
		N2 = scan.nextDouble();
		
		System.out.print("Qual a N3 do aluno: ");
		N3 = scan.nextDouble();
		
		mediaEx = (N1 + N2 + N3) / 3;
		System.out.printf("A média de exercícios é %.2f", mediaEx);
		
		System.out.println("");
		
		mediaAproveitamento = (N1 + (N2 * 2) + (N3 * 3) + mediaEx) / 7;
		
		if (mediaAproveitamento >= 9.0) {
			System.out.println("Conceito A");
		} else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
			System.out.println("Conceito B");
		} else if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
			System.out.println("Conceito C");
		} else {
			System.out.println("Conceito D");
		}
		
		scan.close();
	}

}
