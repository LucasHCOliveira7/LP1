package exercicios;

public class exercicio_74 {

	public static void main(String[] args) {
		
		// Escreva um algoritmo que imprima a tabuada (de 1 a 10) para os números de 1 a 10. 
		
		int n = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			n++;
			
			System.out.println("");
			System.out.println("TABUADA DO " + i);
			
			for (int t = 1; t <= 10; t++) {
				int r = n * t;
				System.out.println(n + " x " + t + " = " + r);
			}
		}

	}

}
