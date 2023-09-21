package exercicios;

import java.util.Scanner;

public class exercicio_55 {

	public static void main(String[] args) {
		
		// Escreva um algoritmo que calcule e imprima a tabuada do 8 (1 a 10).
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual tabuada deseja ver? ");
		int n = scan.nextInt();
		
		System.out.println("");
		System.out.println("TABUADA DO " + n);
		
		for (int i = 1; i <= 10; i++) {
			int r = n * i;
			System.out.println(n + " x " + i + " = " + r);
		}
		
		scan.close();
	}

}
