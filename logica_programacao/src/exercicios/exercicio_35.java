package exercicios;

import java.util.Scanner;

public class exercicio_35 {

	public static void main(String[] args) {
		
		// Um posto está vendendo combustíveis com a seguinte tabela de descontos: 
		
		// | até 20 litros, desconto de 3% por litro Álcool   |
		// | acima de 20 litros, desconto de 5% por litro     |
		// | até 20 litros, desconto de 4% por litro Gasolina |
		// | acima de 20 litros, desconto de 6% por litro     |
		
		// Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da 
		// seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se 
		// que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90. 

		Scanner scan = new Scanner(System.in);
		
		double precoAlcool = 2.90;
		double precoGasolina = 3.30;
		int litrosVendidos;
		char tipoCombustivel;
		double valorPagar;
		
		System.out.print("Qual o tipo de combustível: [A] Álcool, [G] Gasolina ");
		tipoCombustivel = scan.next().charAt(0);
		
		System.out.print("Quantos litros de combustível vai abastecer: ");
		litrosVendidos = scan.nextInt();
		
		if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
			if (litrosVendidos > 20) {
				valorPagar = (litrosVendidos * precoAlcool) * 0.95;
				System.out.printf("O valor total a pagar é de R$ %.2f", valorPagar);
			} else {
				valorPagar = (litrosVendidos * precoAlcool) * 0.97;
				System.out.printf("O valor total a pagar é de R$ %.2f", valorPagar);
			}
		} else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
			if (litrosVendidos > 20) {
				valorPagar = (litrosVendidos * precoGasolina) * 0.94;
				System.out.printf("O valor total a pagar é de R$ %.2f", valorPagar);
			} else {
				valorPagar = (litrosVendidos * precoGasolina) * 0.96;
				System.out.printf("O valor total a pagar é de R$ %.2f", valorPagar);
			}
		} else {
			System.out.println("Tipo inválido! Tente novamente!");
		}
		
		scan.close();
	}

}
