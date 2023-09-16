package exercicios;

import java.util.Scanner;

public class exercicio_29 {

	public static void main(String[] args) {
		
		// Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 
		// maiores.
		
		Scanner scan = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int somaMaior = 0;
		
		System.out.print("Digite o primeiro valor: ");
		num1 = scan.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		num2 = scan.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		num3 = scan.nextInt();
		
		if (num1 == num2 || num2 == num3 || num1 == num3) {
			System.out.println("Os valores são iguais, digite novamente!");
		} else if (num1 > num2 && num1 > num3) {
            somaMaior = num1 + Math.max(num2, num3);
        } else if (num2 > num1 && num2 > num3) {
            somaMaior = num2 + Math.max(num1, num3);
        } else if (num3 > num1 && num3 > num2) {
            somaMaior = num3 + Math.max(num1, num2);
        }
		
		System.out.println("A soma dos dois maiores valores é: " + somaMaior);
		
		scan.close();
	}

}
