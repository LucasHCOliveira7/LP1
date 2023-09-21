package exercicios;

import java.util.Scanner;

public class exercicio_60 {

	public static void main(String[] args) {
		
		// Ler 10 valores e escrever quantos desses valores lidos estão no intervalo [10,20] (inlcuindo os 
		// valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo.

		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int dentroIntervalo = 0;
		int foraIntervalo = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite um número: ");
			num = scan.nextInt();
			
			if (num >= 10 && num <= 20) {
				dentroIntervalo++;
			} else {
				foraIntervalo++;
			}
		}
		
		System.out.println(dentroIntervalo + " número(s) esta(ão) dentro do intervalo (10 a 20)");
		System.out.println(foraIntervalo + " número(s) esta(ão) fora do intervalo");
		
		scan.close();
	}

}
