package exercicios;

import java.util.Scanner;

public class exercicio_88 {

	public static void main(String[] args) {
		
		// Faça um algoritmo para ler um vetor de 20 números. Após isto, deverá ser lido mais um número 
		// qualquer e verificar se esse número existe no vetor ou não. Se existir, o algoritmo deve gerar um novo 
		// vetor sem esse número. (Considere que não haverão números repetidos no vetor). 
		
		Scanner scan = new Scanner(System.in);

		int[] vetor = new int[20];
		
		for (int i = 0; i < 20; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			vetor[i] = scan.nextInt();
		}
		
		System.out.println("Vetor completo:");
		for (int i = 0; i < 20; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		
		System.out.print("Digite mais um número: ");
		int num = scan.nextInt();
		
		boolean numeroEncontrado = false;
		for (int i = 0; i < 20; i++) {
			if (num == vetor[i]) {
				numeroEncontrado = true;
				break;
			} 
		}
		
		if (numeroEncontrado) {
            int[] novoVetor = new int[19];
            int indexNovoVetor = 0;

            for (int i = 0; i < 20; i++) {
                if (vetor[i] != num) {
                    novoVetor[indexNovoVetor] = vetor[i];
                    indexNovoVetor++;
                }
            }

            System.out.println("O número existe no vetor. Novo vetor sem o número:");
            for (int i = 0; i < 19; i++) {
            	System.out.print(novoVetor[i] + " ");
            }
        } else {
            System.out.println("O número não existe no vetor.");
        }
		
		scan.close();
	}

}
