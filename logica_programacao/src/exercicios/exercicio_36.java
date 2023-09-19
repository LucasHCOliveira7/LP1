package exercicios;

import java.util.Scanner;

public class exercicio_36 {

	public static void main(String[] args) {
		
		// Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades 
		// dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma 
	    // das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais 
	    // novo com a mulher mais velha. 

		Scanner scan = new Scanner(System.in);
		
		int idadeH1;
		int idadeH2;
		int idadeM1;
		int idadeM2;
		int maisVelho = 0;
		int maisNovo = 0;
		int maisNova = 0;
		int maisVelha = 0;
		
		System.out.print("Qual a idade do 1° homem: ");
		idadeH1 = scan.nextInt();
		
		System.out.print("Qual a idade do 2° homem: ");
		idadeH2 = scan.nextInt();
		
		System.out.print("Qual a idade da 1° mulher: ");
		idadeM1 = scan.nextInt();
		
		System.out.print("Qual a idade da 2° mulher: ");
		idadeM2 = scan.nextInt();
		
		if (idadeH1 != idadeH2 && idadeM1 != idadeM2) {
			
			// Homem mais velho
			if (idadeH1 > idadeH2) {
				maisVelho = idadeH1;
			} else if (idadeH2 > idadeH1) {
				maisVelho = idadeH2;
			}
			
			// Mulher mais nova
			if (idadeM1 < idadeM2) {
				maisNova = idadeM1;
			} else if (idadeM2 < idadeM1) {
				maisNova = idadeM2;
			}
			
			// Soma da idade do homem mais velho com mulher mais nova
			int somaIdades = maisVelho + maisNova;
			System.out.println("A soma das idades do homem mais velho com a mulher mais nova é de: " + somaIdades);
			
			// Homem mais novo
			if (idadeH1 < idadeH2) {
				maisNovo = idadeH1;
			} else if (idadeH2 < idadeH1) {
				maisNovo = idadeH2;
			}
			
			// Mulher mais velha
			if (idadeM1 > idadeM2) {
				maisVelha = idadeM1;
			} else if (idadeM2 > idadeM1) {
				maisVelha = idadeM2;
			}
			
			// Produto da idade do homem mais novo com a mulher mais velha
			int produtoIdades = maisNovo * maisVelha;
			System.out.println("O produto da idade do homem mais novo com a mulher mais velha é de: " + produtoIdades);
			
		} else {
			System.out.println("As idades são iguais! Defina idades diferentes.");
		}
		
		scan.close();
	}

}
