package exercicios;

import java.util.Scanner;

public class exercicio_28 {

	public static void main(String[] args) {
		
		// Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int maiorNum;
		
		System.out.print("Digite o primeiro valor: ");
		num1 = scan.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		num2 = scan.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		num3 = scan.nextInt();
		
		if (num1 == num2 || num2 == num3 || num1 == num3) {
			System.out.println("Os valores são iguais, digite novamente!");
		} else if (num1 > num2 && num1 > num3) {
			maiorNum = num1;
			System.out.println("O primeiro número é o maior!");
		} else if (num2 > num1 && num2 > num3) {
			maiorNum = num2;
			System.out.println("O segundo número é o maior!");
		} else if (num3 > num1 && num3 > num2) {
			maiorNum = num3;
			System.out.println("O terceiro número é o maior!");
		}
		
		scan.close();
	}

}
