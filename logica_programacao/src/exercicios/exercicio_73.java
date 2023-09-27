package exercicios;

import java.util.Scanner;

public class exercicio_73 {

	public static void main(String[] args) {
		
		// A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Faça um algoritmos 
		// para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
		
		//	a) Média de salário da população 
		//	b) Média do número de filhos 
		//	c) Maior salário dos habitantes 
		//	d) Percentual de pessoas com salário menor que R$ 150,00 
		
		//	Obs.: O final da leitura dos dados se dará com a entrada de um “salário negativo”.

		Scanner scan = new Scanner(System.in);
		
		double salario = 0;
		int numFilhos = 0;
		double maiorSalario = Integer.MIN_VALUE;
		int pessoasSalarioMenor150 = 0;
		double somaSalario = 0;
		int somaNumFilhos = 0;
		int quantHabitantes = 0;
		
		System.out.print("Digite o salário desse habitante (ou um salário negativo para encerrar): R$ ");
		
		while (true){
			salario = scan.nextDouble();
			
			if (salario < 0) {
				break;
			}
			
			quantHabitantes++;
			// System.out.println(quantHabitantes);
			
			somaSalario += salario;
			// System.out.println(somaSalario);
			
			if (salario > maiorSalario) {
				maiorSalario = salario;
			}
			// System.out.println(maiorSalario);
			
			System.out.print("Quantos filhos esse habitante tem? ");
			numFilhos = scan.nextInt();
			
			somaNumFilhos += numFilhos;
			// System.out.println(somaNumFilhos);
			
			if (salario < 150.00) {
				pessoasSalarioMenor150++;
			}
			
			System.out.print("Digite o salário do próximo habitante (ou um salário negativo para encerrar): R$ ");
		}
		
		System.out.println("");
			
		// a) Média de salário da população
		double mediaSalario = somaSalario / quantHabitantes;
		System.out.println("A média de salário da população é de R$ " + mediaSalario);
			
		// b) Média do número de filhos 
		double mediaNumFilhos = somaNumFilhos / quantHabitantes;
		System.out.println("A média do número de filhos é de " + mediaNumFilhos);
			
		// c) Maior salário dos habitantes 
		System.out.println("O maior salário dos habitantes é de R$ " + maiorSalario);
			
		// d) Percentual de pessoas com salário menor que R$ 150,00 
		double percSalarioMenor150 = (double) pessoasSalarioMenor150 / (quantHabitantes * 100);
		System.out.println("O percentual de habitantes com salário menor que R$ 150,00 é de " + percSalarioMenor150);
			
		scan.close();
	}

}
