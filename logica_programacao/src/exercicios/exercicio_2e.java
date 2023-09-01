package exercicios;

public class exercicio_2e {

	public static void main(String[] args) {
		
		/*
		 |      A <- 10     |
		 |      B <- 5      |
		 |    C <- A + B    |
		 |      B <- 20     |
		 |      A <- 10     |
		 | Escrever A, B, C |
		*/

		// A recebe o valor de 10
		// B recebe o valor de 5
		// C é a soma de A + B
		// B recebe o novo valor de 20
		// A recebe o novo valor de 10
		// Mostra no console o valor de A, B e C
		
		int A, B, C = 0;
		
		A = 10;
		B = 5;
		C = A + B;
		B = 20;
		A = 10;
		
		System.out.println("Valor de A = " + A + ", Valor de B = " + B + ", Valor de C = " + C);

	}

}
