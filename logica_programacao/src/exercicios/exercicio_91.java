package exercicios;

import java.util.Random;

public class exercicio_91 {

	public static void main(String[] args) {
		
		// Faça um algoritmo para ler 50 números e armazenar em um vetor VET, verificar e escrever se 
		// existem números repetidos no vetor VET e em que posições se encontram. 

		Random random = new Random();
		
		int[] VET = new int[50];
		
		for (int i = 0; i < 50; i++) {
			VET[i] = random.nextInt(251);
		}
		
		System.out.println("VETOR ALEATÓRIO");
		for (int i = 0; i < 50; i++) {
			System.out.print(VET[i] + " ");
		}
		System.out.println();
		
		boolean repetido = false;

        for (int i = 0; i < VET.length; i++) {
            for (int j = i + 1; j < VET.length; j++) {
                if (VET[i] == VET[j]) {
                    repetido = true;
                    System.out.println("Número repetido: " + VET[i] + " - Posições: " + i + " e " + j);
                }
            }
        }

        if (!repetido) {
            System.out.println("Não há números repetidos no vetor.");
        }
	}

}
