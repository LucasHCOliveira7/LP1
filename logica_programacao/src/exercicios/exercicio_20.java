package exercicios;

import java.util.Scanner;

public class exercicio_20 {

	public static void main(String[] args) {
		
		// Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int valor1 = leitura.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int valor2 = leitura.nextInt();
		
		if (valor1 == valor2) {
			System.out.println("Os valores são igual, digite valores diferentes!");
		} else {
			int menorValor = Math.min(valor1, valor2);
			int maiorValor = Math.max(valor1, valor2);
			System.out.println("Os valores em ordem crescente são: " + menorValor + ", " + maiorValor);
		}
		
		leitura.close();
	}

}
