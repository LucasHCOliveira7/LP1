package exercicios;

import java.util.Scanner;

public class exercicio_34 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int X;
		int Y;
		String resposta;
		
		System.out.print("Qual o valor de X: ");
		X = scan.nextInt();
		
		System.out.print("Qual o valor de Y: ");
		Y = scan.nextInt();
		
		int Z = (X * Y) + 5;
		
		if (Z <= 0) {
			resposta = "A";
			System.out.println(resposta);
		} else if (Z <= 100) {
			resposta = "B";
			System.out.println(resposta);
		} else {
			resposta = "C";
			System.out.println(resposta);
		}
		
		System.out.println(Z + ", " + resposta);
		
		scan.close();
	}

}
