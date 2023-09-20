package exercicios;

import java.util.Scanner;

public class exercicio_42 {

	public static void main(String[] args) {
		
		// Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para 
		// estar em condições, um dos seguintes requisitos deve ser satisfeito: 
		
		//	 - Ter no mínimo 65 anos de idade. 
		//	 - Ter trabalhado no mínimo 30 anos. 
		//	 - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos. 
		
		//	Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano 
		//	de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo 
		//	de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.

		Scanner scan = new Scanner(System.in);
		
		int numeroEmpregado;
		int anoNascimento;
		int anoIngresso;
		int anoAtual = 2023;
		int idadeFuncionario;
		int tempoEmpregado;
		
		System.out.print("Informe o código do empregado: ");
		numeroEmpregado = scan.nextInt();
		
		System.out.print("Qual o ano de nascimento do empregado: ");
		anoNascimento = scan.nextInt();
		
		System.out.print("Qual o ano de ingresso na empresa: ");
		anoIngresso = scan.nextInt();
		
		idadeFuncionario = anoAtual - anoNascimento;
		tempoEmpregado = anoAtual - anoIngresso;
		System.out.println("O funcionário " + numeroEmpregado + " tem " + idadeFuncionario + " anos de idade \n"
				+ "e está a " + tempoEmpregado + " anos na empresa.");
		
		if (idadeFuncionario >= 65) {
			System.out.println("Requerer aposentadoria");
		} else if (tempoEmpregado >= 30) {
			System.out.println("Requerer aposentadoria");
		} else if (idadeFuncionario >= 60 && tempoEmpregado >= 25) {
			System.out.println("Requerer aposentadoria");
		} else {
			System.out.println("Não requerer");
		}
		
		scan.close();
	}

}
