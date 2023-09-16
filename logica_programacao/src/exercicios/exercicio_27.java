package exercicios;

import java.util.Scanner;

public class exercicio_27 {

	public static void main(String[] args) {
		
		// Ler um valor e escrever se é positivo, negativo ou zero.
		
		Scanner leitura = new Scanner(System.in);

		int num;
		
		System.out.print("Digite um número: ");
		num = leitura.nextInt();
		
		if (num == 0) {
			System.out.println("O número é zero!");
		} else if (num > 0) {
			System.out.println("O número é positivo!");
		} else {
			System.out.println("O número é negativo!");
		}
		
		
		leitura.close();
	}

}
