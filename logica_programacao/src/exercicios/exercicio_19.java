package exercicios;

import java.util.Scanner;

public class exercicio_19 {

	public static void main(String[] args) {
		
		// Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite o valor 1: ");
		int valor1 = leitura.nextInt();
		
		System.out.print("Digite o valor 2: ");
		int valor2 = leitura.nextInt();
		
		if (valor1 > valor2) {
			int maiorValor = valor1;
			System.out.println("O maior valor é o valor 1");
		} else {
			int maiorValor = valor2;
			System.out.println("O maior valor é o valor 2");
		}
		
		leitura.close();
	}

}
