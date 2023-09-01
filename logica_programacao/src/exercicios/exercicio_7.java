package exercicios;

import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) {
		
		// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade 
		// dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Qual sua idade em anos? ");
		int anos = leitura.nextInt();

		System.out.println("Qual sua idade em meses? ");
		int mes = leitura.nextInt();
		
		System.out.println("Qual sua idade em dias? ");
		int dia = leitura.nextInt();
		
		int idadeEmDias = (anos * 365) + (mes * 30) + dia;
		
		System.out.println("Sua idade em dias é " + idadeEmDias + " dias.");
		
	}

}
