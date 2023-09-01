package exercicios;

import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		
		// Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = leitura.nextInt();
		
		int antecessor = valor - 1;
		System.out.println("O antecessor de " + valor + " é " + antecessor);

	}

}
