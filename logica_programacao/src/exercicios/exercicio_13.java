package exercicios;

import java.util.Scanner;

public class exercicio_13 {

	public static void main(String[] args) {
		
		// Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno. 
		// Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média 
		// final é:
		
		//               n1 * 2 + n2 * 3 + n3 * 5 
		// mediafinal = --------------------------
		//                          10            

		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite a nota 1 do aluno: ");
		int n1 = leitura.nextInt();
		
		System.out.print("Digite a nora 2 do aluno: ");
		int n2 = leitura.nextInt();
		
		System.out.print("Digite a nota 3 do aluno: ");
		int n3 = leitura.nextInt();
		
		int mediaFinal = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
		
		System.out.printf("A média final do aluno é " + mediaFinal);
		
		leitura.close();
	}

}
