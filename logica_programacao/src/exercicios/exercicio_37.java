package exercicios;

import java.util.Scanner;

public class exercicio_37 {

	public static void main(String[] args) {
		
		// Uma fruteira está vendendo frutas com a seguinte tabela de preços:
		
		//           |  Até 5Kg  | Acima de 5Kg | 
		// | Morango | R$ 2,50Kg |   R$ 2,20Kg  | 
		// | Maçã    | R$ 1,80Kg |   R$ 1,50Kg  | 
		
		// Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá 
		// ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de 
		// morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

		Scanner scan = new Scanner(System.in);
		
		double precoMorango = 0;
		double precoMaca = 0;
		int kgCompradoMorango;
		int kgCompradoMaca;
		double valorPagar = 0;
		
		System.out.print("Quantos kilos comprou de morango: ");
		kgCompradoMorango = scan.nextInt();
		
		System.out.print("Quantos kilos comprou de maçã: ");
		kgCompradoMaca = scan.nextInt();
		
		int kgTotal = kgCompradoMorango + kgCompradoMaca;
		
		if (kgTotal > 5) {
			precoMorango = 2.20;
			precoMaca = 1.50;

			valorPagar = (kgCompradoMorango * precoMorango) + (kgCompradoMaca * precoMaca);
			System.out.println("Foram comptados " + kgTotal + " quilos de frutas.");
			System.out.printf("O valor total a pagar é de R$ %.2f", valorPagar);
			
		} else {
			precoMorango = 2.50;
			precoMaca = 1.80;
			
			valorPagar = (kgCompradoMorango * precoMorango) + (kgCompradoMaca * precoMaca);
			System.out.println("Foram comprados " + kgTotal + " quilos de frutas.");
			System.out.printf("O valor total a pagar é de R$ %.2f", valorPagar);
		}
		
		System.out.println();
		System.out.println();
		
		if (kgTotal > 8 || valorPagar > 25.00) {
			if (kgTotal > 8) {
				System.out.println("Você comprou mais de 8Kg de frutas ou gastou mais de R$ 25,00! \n"
						+ "Parabéns! Ganhou um desconto de 10%.");
				double desconto = valorPagar * 0.90;
				System.out.printf("O novo valor a pagar é de R$ %.2f", desconto);
			}
		} else {
			System.out.println("Sinto muito! Mas não ganhou o desconto.");
		}
		
		scan.close();
		
	}

}
