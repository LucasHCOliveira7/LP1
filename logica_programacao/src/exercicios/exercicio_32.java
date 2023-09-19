package exercicios;

import java.util.Scanner;

public class exercicio_32 {

	public static void main(String[] args) {
		
		// Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome 
		// do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.

		Scanner scan = new Scanner(System.in);
		
		String nomeTime1;
		String nomeTime2;
		int golsTime1;
		int golsTime2;
		String vencedor;
		
		System.out.print("Qual o nome do time 1: ");
		nomeTime1 = scan.nextLine();
		
		System.out.print("Qual o nome do time 2: ");
		nomeTime2 = scan.nextLine();
		
		System.out.print("Quantos gols o time 1 marcou: ");
		golsTime1 = scan.nextInt();
		
		System.out.print("Quantos gols o time 2 marcou: ");
		golsTime2 = scan.nextInt();
		
		System.out.println("O partida de hoje foi: " + nomeTime1 + "(" + golsTime1 + ") X (" + golsTime2 + ") " + nomeTime2);
		
		if (golsTime1 > golsTime2) {
			vencedor = nomeTime1;
			System.out.println("O time " + nomeTime1 + " foi o ganhador!");
		} else if (golsTime2 > golsTime1) {
			vencedor = nomeTime2;
			System.out.println("O time " + nomeTime2 + " foi o ganhador!");
		} else {
			System.out.println("A partida terminou em EMPATE");
		}
		
		scan.close();
	}

}
