package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio_87 {

	public static void main(String[] args) {

		// O mesmo exercício anterior, mas depois de ordenar os elementos do vetor em ordem crescente,
		// deve ser lido mais um número qualquer e inserir esse novo número na posição correta, ou seja,
		// mantendo a ordem crescente do vetor.

		Scanner scan = new Scanner(System.in);

		int[] A = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			A[i] = scan.nextInt();
		}

		System.out.println("Vetor atual:");
		for (int i = 0; i < 10; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();

		Arrays.sort(A);

		System.out.println("Vetor em ordem crescente:");
		for (int i = 0; i < 10; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
		
		int[] novoVetor = new int[11];

		// Copia os elementos do vetor A para o novoVetor
		// Velor A / posição inicial / novoVetor / posição inicial / elementos a serem copiados
        System.arraycopy(A, 0, novoVetor, 0, 10);

        System.out.print("Digite um novo número para inserir no vetor ordenado: ");
        int novoNumero = scan.nextInt();

        int posicaoInsercao = 0;
        while (posicaoInsercao < 10 && novoNumero > novoVetor[posicaoInsercao]) {
            posicaoInsercao++;
        }

        for (int i = 10; i > posicaoInsercao; i--) {
            novoVetor[i] = novoVetor[i - 1];
        }

        novoVetor[posicaoInsercao] = novoNumero;

        System.out.println("Vetor com o novo número:");
        for (int i = 0; i < 11; i++) {
            System.out.print(novoVetor[i] + " ");
        }

		scan.close();

	}

}
