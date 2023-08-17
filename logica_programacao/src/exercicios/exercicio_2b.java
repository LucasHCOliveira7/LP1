package exercicios;

public class exercicio_2b {

	public static void main(String[] args) {
		
		/*
		 |      A <- 30     |
		 |      B <- 20     |
		 |    C <- A + B    |
		 |    Escrever C    |
		 |      B <- 10     |
		 |   Escrever B, C  |
		 |    C <- A + B    |
		 | Escrever A, B, C |
		*/

		// A recebe o valor 30
		// B recebe o valor 20
		// C é a soma de A + B
		// Mostra no console o valor de C
		// B recebe o novo valor de 10
		// Mostra no console o valor de B e C
		// C é a soma de A + B
		// Mostra no console o valor de A, B e C
		
		int A;
		int B;
		int C;
		
		A = 30;
		B = 20;
		C = A + B;
		
		System.out.println("Valor de C = " + C);
		
		B = 10;
		
		System.out.println("Valor de B = " + B + ", Valor de C = " + C);
		
		C = A + B;
		
		System.out.println("Valor de A = " + A + ", Valor de B = " + B + " e Valor de C = " + C);

	}

}
