package exercicios;

public class exercicio_1 {

	public static void main(String[] args) {
		
		/*
		Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B. 
		A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o 
		valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados 
		nas variáveis.
		*/

		int A, B, x = 0; 
		
		A = 10;
		B = 20;
		x = A;
		
		System.out.println("Valor de A = " + A);
		System.out.println("Valor de B = " + B);
		
		A = B;
		B = x;
		
		System.out.println("Novo valor de A = " + A);
		System.out.println("Novo valor de B = " + B);

	}

}
