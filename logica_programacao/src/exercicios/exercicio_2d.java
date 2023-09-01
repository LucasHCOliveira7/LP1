package exercicios;

public class exercicio_2d {

	public static void main(String[] args) {
		
		/* 
		 |     A <- 10      |
		 |    B <- A + 1    |
		 |    A <- B + 1    |
		 |    B <- A + 1    |
		 |    Escrever A    |
		 |    A <- B + 1    |
		 |   Escrever A, B  |
		*/

		// A recebe o valor de 10
		// B é a soma de A + 1
		// A é a soma de B + 1
		// B é a soma de A + 1
		// Mostra no console o valor de A
		// A recebe o valor de B + 1
		// Mostra no console o valor de A e B
		
		int A, B = 0;
		
		A = 10;
		B = A + 1;
		A = B + 1;
		B = A + 1;
		
		System.out.println("Valor de A = " + A);
		
		A = B + 1;
		
		System.out.println("Valor de A = " + A + ", Valor de B = " + B);

	}

}
