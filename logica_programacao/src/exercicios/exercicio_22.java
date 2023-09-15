package exercicios;

import java.util.Scanner;

public class exercicio_22 {

	public static void main(String[] args) {
		
		// A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais 
		// de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
		// Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva 
		// o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas 
		// (considere que o mês possua 4 semanas exatas). 

		Scanner leitura = new Scanner(System.in);
		
		int horasTrabalhadasMes;
		double salarioHora;
		int horaExtraTrabalhada;
		double salarioHoraExtra;
		double salarioTotal;
		
		
		System.out.print("Quantas horas o funcionário trabalhou no mês: ");
		horasTrabalhadasMes = leitura.nextInt();
		
		System.out.print("Qual o salário por hora do funcionário: R$ ");
		salarioHora = leitura.nextDouble();
		
		horaExtraTrabalhada = horasTrabalhadasMes - 160;
		salarioHoraExtra = horaExtraTrabalhada * (salarioHora * 0.5);
		
		if (horasTrabalhadasMes > 160) {
			horasTrabalhadasMes -= horaExtraTrabalhada;
			salarioTotal = horasTrabalhadasMes * salarioHora + salarioHoraExtra;
			System.out.println("O funcionário trabalhou " + horaExtraTrabalhada + " horas extras no mês e recebeu R$ " + salarioHoraExtra + " pelas horas extras.");
			System.out.println("O salário total do funcionário é de R$ " + salarioTotal);
		} else {
			salarioTotal = horasTrabalhadasMes * salarioHora;
			System.out.println("O salário total do funcionário é de R$ " + salarioTotal);
		}
		
		leitura.close();
		
	}

}
