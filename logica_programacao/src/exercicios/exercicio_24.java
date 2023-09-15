package exercicios;

import java.util.Scanner;

public class exercicio_24 {

	public static void main(String[] args) {
		
		// Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que 
		// ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que 
		// ultrapassar este valor, calcular e escrever o seu salário total.
		
		Scanner leitura = new Scanner(System.in);
		
		double salario;
		double vendas;
		double comissao1;
		double comissao2;
		double salarioTotal;
		
		System.out.print("Qual o salário do vendedor: R$ ");
		salario = leitura.nextDouble();
		
		System.out.print("Qual o valor das vendas efetuadas: R$ ");
		vendas = leitura.nextDouble();
		
		if (vendas <= 1500) {
			comissao1 = vendas * 0.03;
			salarioTotal = salario + comissao1;
			System.out.println("O salário total do vendedor é R$ " + salarioTotal);
		} else {
			comissao1 = 1500 * 0.03;
			comissao2 = (vendas - 1500) * 0.05;
			salarioTotal = salario + comissao1 + comissao2;
			System.out.println("O salário total do vendedor é de R$ " + salarioTotal);
		}
		
		leitura.close();

	}

}
