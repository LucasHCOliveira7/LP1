package exercicios;

import java.util.Scanner;
import java.util.Calendar;

public class exercicio_18 {

	public static void main(String[] args) {
		
		// Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela 
		// poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

		Scanner leitura = new Scanner(System.in);
		
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println("O ano atual é " + anoAtual);
		
		System.out.print("Digite o ano de nascimento: ");
		int anoNascimento = leitura.nextInt();
		
		int idade = anoAtual - anoNascimento;
		
		if (idade >= 16) {
			System.out.printf("A pessoa já tem %s anos de idade, então ela pode votar esse ano!", idade);
		} else {
			System.out.printf("A pessoa ainda tem %s anos de idade, então ela não pode votar esse ano!", idade);
		}
		
		leitura.close();
		
	}

}
