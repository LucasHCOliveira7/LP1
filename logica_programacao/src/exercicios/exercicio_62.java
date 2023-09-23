package exercicios;

import java.util.Scanner;

public class exercicio_62 {

	public static void main(String[] args) {
		
		// Ler o número de alunos existentes em uma turma e, após isto, ler as notas destes alunos, calcular e 
		// escrever a média aritmética dessas notas lidas.
		
		Scanner scan = new Scanner(System.in);
		
		int alunos = 0;
		double nota = 0;
		double soma = 0;
		
		System.out.print("Quantos alunos tem na turma: ");
		alunos = scan.nextInt();
		
		for (int i = 1; i <= alunos; i++) {
			System.out.print("Qual a nota do " + i + "° aluno: ");
			nota = scan.nextDouble();
			soma += nota;
		}
		
		double media = soma / alunos;
		System.out.println("A média das notas da turma é " + media);
		
		scan.close();
	}

}
