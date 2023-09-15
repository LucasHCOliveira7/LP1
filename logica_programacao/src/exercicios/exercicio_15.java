package exercicios;

import java.util.Scanner;

public class exercicio_15 {

	public static void main(String[] args) {
		
		//  Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro: ");
		int valor = leitura.nextInt();
		
		if (valor > 0) {
			System.out.println("Esse valor é positivo!");
		} else {
			System.out.println("Esse valor é negativo!");
		}
		
		leitura.close();
	}

}
