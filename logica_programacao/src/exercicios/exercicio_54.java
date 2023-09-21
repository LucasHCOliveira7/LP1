package exercicios;

import java.util.Scanner;

public class exercicio_54 {

	public static void main(String[] args) {
		
		// Modifique o exercício anterior para aceitar somente valores maiores que 0 para N. Caso o valor 
		// informado (para N) não seja maior que 0, deverá ser lido um novo valor para N. 
		
		Scanner scan = new Scanner(System.in);

		int N;
		
		System.out.print("Qual o valor de N: ");
		N = scan.nextInt();
		
		while (N <= 0) {
			System.out.println("N tem que ser maior que ZERO! \n"
					+ "Digite novamente: ");
			N = scan.nextInt();
		}
		
		if (N > 0) {
			for (int i = 1; i <= N; i++) {
				System.out.println(i);
			}
		}
		
		scan.close();
	}

}
