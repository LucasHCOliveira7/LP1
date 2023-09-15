package exercicios;

import java.util.Scanner;

public class exercicio_14 {

	public static void main(String[] args) {
		
		// Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso 
		// contrário escrever NÃO É MAIOR QUE 10! 

		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = leitura.nextInt();
		
		if (num >= 10) {
			System.out.println("Esse número é maior que 10!");
		} else {
			System.out.println("Esse número não é maior que 10!");
		}
		
		leitura.close();
		
	}

}
