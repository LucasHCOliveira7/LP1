package exercicios;

import java.util.Scanner;

public class exercicio_43 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double A;
		double B;
		double C;
		String mens;
		
		System.out.print("Qual o valor de A: ");
		A = scan.nextDouble();
		
		System.out.print("Qual o valor de B: ");
		B = scan.nextDouble();
		
		System.out.print("Qual o valor de C: ");
		C = scan.nextDouble();
		
		if (A < B + C && B < A + C && C < A + B) {
			if (A == B && B == C) {
				mens = "Triângulo Equilátero";
			} else {
				if (A == B || B == C || A == C) {
					mens = "Triângulo Isóceles";
				} else {
					mens = "Triângulo Escaleno";
				}
			}
		} else {
			mens = "Não é possível formar um triângulo!";
		}
		
		System.out.println(mens);
		
		scan.close();
	}

}
