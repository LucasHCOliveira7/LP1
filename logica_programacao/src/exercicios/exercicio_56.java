package exercicios;

import java.util.Scanner;

public class exercicio_56 {

	public static void main(String[] args) {
		
		// Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor 
		// lido

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual tabuada deseja ver (1 a 10): ");
		int n = scan.nextInt();
		
		while (n < 1 || n > 10) {
			System.out.print("Apenas tabuada de 1 a 10! \n"
					+ "Digite novamente a tabuada que deseja (1 a 10): ");
			n = scan.nextInt();
		}
		
		System.out.println("");
		System.out.println("TABUADA DO " + n);
		
		for (int i = 1; i <= 10; i++) {
			int r = n * i;
			System.out.println(n + " x " + i + " = " + r);
		}
		
		scan.close();
	}

}
