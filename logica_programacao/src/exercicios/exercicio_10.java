package exercicios;

import java.util.Scanner;

public class exercicio_10 {

	public static void main(String[] args) {
		
		// O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do 
		// distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor 
		// seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, 
		// calcular e escrever o custo final ao consumidor. 
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite o valor de fábrica: R$ ");
		double valorFabrica = leitura.nextDouble();
		
		double percDistribuidor = (valorFabrica * 28) / 100;
		double impostos = (valorFabrica * 45) / 100;
		
		System.out.printf("Valor do percentual do distribuidor: R$ %.2f\n", percDistribuidor);
		System.out.printf("Valor dos impostos: R$ %.2f\n", impostos);
		
		double carroNovo = valorFabrica + percDistribuidor + impostos;
		System.out.printf("O preço de um carro novo é R$ %.2f", carroNovo);

	}

}
