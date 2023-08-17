package exercicios;

public class exercicio_2f {

	public static void main(String[] args) {
		
		/*
		 |      X <- 1      |
		 |      Y <- 2      |
		 |    Z <- Y - X    |
		 |    Escrever Z    |
		 |      X <- 5      |
		 |    Y <- X + Z    |
		 | Escrever X, Y, Z |
		*/

		// X recebe o valor de 1
		// Y recebe o valor de 2
		// Z é a soma de Y + X
		// Mostra no console o valor de Z
		// X recebe o novo valor de 5
		// Y é a soma de X + Z
		// Mostra no console o valor de X, Y e Z
		
		int X;
		int Y;
		int Z;
		
		X = 1;
		Y = 2;
		Z = Y - X;
		
		System.out.println("Valor de Z = " + Z);
		
		X = 5;
		Y = X + Z;
		
		System.out.println("Valor de X = " + X + ", Valor de Y = " + Y + ", Valor de Z = " + Z);

	}

}
