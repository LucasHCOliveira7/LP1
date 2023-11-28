package exercicios;

import java.util.Scanner;

public class exercicio_79 {

	public static void main(String[] args) {
		
		// Escreva um algoritmo que permita a leitura das notas de uma turma de 20 alunos. Calcular a média 
		// da turma e contar quantos alunos obtiveram nota acima desta média calculada. Escrever a média da 
		// turma e o resultado da contagem.
		
		Scanner scan = new Scanner(System.in);

		double somaNotas = 0;
		double[] nota = new double[20];
		
		for (int i = 0; i < 20; i++) {
			System.out.print("Nota do aluno " + (i + 1) + ": ");
			nota[i] = scan.nextDouble();
			somaNotas = somaNotas + nota[i];
//			System.out.println(somaNotas);
		}
		
		double media = somaNotas / 20;
		System.out.printf("A média da turma foi: %.2f\n", media);
		
		int alunosAcimaMedia = 0;

        for (int i = 0; i < 20; i++) {
            if (nota[i] >= media) {
                alunosAcimaMedia++;
            }
        }
        
        System.out.println("Alunos com nota acima da média: " + alunosAcimaMedia);
        
		
		scan.close();
	}

}
