package exercicios;

import java.util.Scanner;

public class exercicio_11 {

	public static void main(String[] args) {
		
		// Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, 
		// mais  uma  comissão  também  fixa  para  cada  carro  vendido  e  mais  5% do  valor  das  
		// vendas  por  ele efetuadas. Escrever um algoritmo que leia o número de  carros por  ele vendidos, 
		// o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. 
		// Calcule e escreva o salário final do vendedor. 

		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Quantos carros o funcionário vendeu: ");
		int carrosVendidos = leitura.nextInt();
		
		System.out.print("Qual o valor das vendas do funcionário: R$ ");
		double vendasFunc = leitura.nextDouble() * 5 / 100;
		
		System.out.print("Qual o salário fixo do vendedor: R$ ");
		double salario = leitura.nextDouble();
		
		System.out.print("Qual o valor que o funcionário recebe por carro vendido: R$ ");
		double comissao = leitura.nextDouble() * carrosVendidos;
		
		double salarioFinal = 0;
		salarioFinal = salario + comissao + vendasFunc;
		System.out.printf("O salário final do funcionário é de R$ %.2f", salarioFinal);
		  
	}

}
