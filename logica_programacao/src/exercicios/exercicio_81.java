package exercicios;

import java.util.Scanner;

public class exercicio_81 {

	public static void main(String[] args) {
		
		// O mesmo exercício anterior, mas agora deve escrever o menor elemento do vetor e a respectiva 
		// posição dele nesse vetor.
		
		Scanner scan = new Scanner(System.in);

        int[] Q = new int[20];
        int menor = Integer.MAX_VALUE;
        int posicao = -1;

        for (int i = 0; i < 20; i++) {
            do {
                System.out.print("Digite o " + (i + 1) + "° número: ");
                Q[i] = scan.nextInt();
            } while (Q[i] < 0);

            if (Q[i] < menor) {
                menor = Q[i];
                posicao = i;
            }
        }

        System.out.println("O menor elemento é " + menor + " e está na posição " + (posicao + 1));

        scan.close();

	}

}
