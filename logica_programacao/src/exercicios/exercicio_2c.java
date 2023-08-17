package exercicios;

public class exercicio_2c {

	public static void main(String[] args) {
		
		/* 
		 |      A <- 10     |
		 |      B <- 20     |
		 |      C <- A      |
		 |      B <- C      |
		 |      A <- B      |
		 | Escrever A, B, C |
		*/

		// A recebe o valor 10
		// B recebe o valor 20
		// C recebe o valor de A
		// B recebe o valor de C
		// A recebe o valor de B
		// Mostra no console o valor de A, B e C
		
		int A;
		int B;
		int C;
		
		A = 10;
		B = 20;
		C = A;
		B = C;
		A = B;
		
		System.out.println("Valor de A = " + A + ", Valor de B = " + B + ", Valor de C = " + C);

	}

}
