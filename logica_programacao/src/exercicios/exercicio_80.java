package exercicios;

import java.util.Scanner;

public class exercicio_80 {

	public static void main(String[] args) {
		
		// Ler um vetor Q de 20 posições (aceitar somente números positivos). Escrever a seguir o valor do 
		// maior elemento de Q e a respectiva posição que ele ocupa no vetor. 
		
        Scanner scan = new Scanner(System.in);

        int[] Q = new int[20];
        int maior = Integer.MIN_VALUE;
        int posicao = -1;

        for (int i = 0; i < 20; i++) {
            do {
                System.out.print("Digite o " + (i + 1) + "° número: ");
                Q[i] = scan.nextInt();
            } while (Q[i] < 0);

            if (Q[i] > maior) {
                maior = Q[i];
                posicao = i;
            }
        }

        System.out.println("O maior elemento é " + maior + " e está na posição " + (posicao + 1));

        scan.close();
    }
	
}
