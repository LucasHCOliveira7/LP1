package exercicios;

import java.util.Scanner;

public class exercicio_31 {

	public static void main(String[] args) {
		
		// Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam 
		// ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma 
		// dos outros 2 lados.
		
		Scanner scan = new Scanner(System.in);

		double A;
		double B;
		double C;
		
		System.out.print("Qual a medida A: ");
		A = scan.nextDouble();
		
		System.out.print("Qual a medida B: ");
		B = scan.nextDouble();
		
		System.out.print("Qual a medida C: ");
		C = scan.nextDouble();
		
		if (A < B + C && B < A + C && C < A + B) {
			System.out.println("As medidas formam um triângulo!");
		} else {
			System.out.println("As medidas não formam um triângulo!");
		}
		
		scan.close();
	}

}
