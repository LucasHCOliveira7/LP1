package exercicios;

import java.util.Scanner;

public class exercicio_77 {

	public static void main(String[] args) {

		// Dado o seguinte vetor:
		//    1 2 3 4 5 6 7 8
		// V [5 1 4 2 7 8 3 6]
		// Qual será o conteúdo do vetor V depois de executado o algoritmo abaixo?

		// Para i de 8 até 5 passo -1 Faça
		// aux = v[i]
		// v[i] = v[8-i+1]
		// v[8-i+1] = aux
		// Fim_Para
		// v[3] = v[1]
		// v[v[3]] = v[v[2]]

		Scanner scan = new Scanner(System.in);

		int[] V = {5, 1, 4, 2, 7, 8, 3, 6};
		
		for (int i = 8; i >= 5; i--) {
			int aux = V[i - 1];
			V[i - 1] = V[8-i+1];
			V[8-i+1] = aux;
		}
		
		V[3] = V[1];
		V[V[3]] = V[V[2]];
		
		for (int i = 0; i < V.length; i++) {
			System.out.print(V[i] + " ");
		}
		
		scan.close();

	}

}
