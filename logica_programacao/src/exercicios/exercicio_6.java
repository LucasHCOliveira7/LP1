package exercicios;

import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		
		// Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a 
		// área do retângulo.
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Área do Retângulo");
		System.out.println();
		
		System.out.println("Qual o valor da base: ");
		double base = leitura.nextDouble();
		
		System.out.println("Qual o valor da altura: ");
		double altura = leitura.nextDouble();
		
		double areaDoRetangulo = base * altura;
		System.out.println("A área do retângulo é " + areaDoRetangulo);
		
	}

}
