package exercicios;

import java.util.Scanner;

public class exercicio_66 {

	public static void main(String[] args) {
		
		// O mesmo exercício anterior, mas agora, considere que o segundo valor lido poderá ser maior ou 
		// menor que o primeiro valor lido, ou seja, deve-se testá-los. 

		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int soma = 0;
		
		System.out.print("Qual o 1° valor: ");
		num1 = scan.nextInt();
		
		System.out.print("Qual o 2° valor: ");
		num2 = scan.nextInt();
		
		if (num2 > num1) {
			for (int i = num1; i <= num2; i++) {
				soma += i;
				// System.out.println(soma);
			}
			System.out.println(soma);
		} else {
			for (int i = num1; i >= num2; i--) {
				soma += i;
				// System.out.println(soma);
			}
			System.out.println(soma);
		}
		
		scan.close();
	}

}
