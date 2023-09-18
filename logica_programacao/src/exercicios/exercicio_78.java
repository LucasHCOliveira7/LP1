package exercicios;

/* 
 Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armaze os nomes lidos em 
um vetor. Após isto, o algoritmo deve permitir a leitura de mais 1 nome qualquer de pessoa e depois 
escrever a mensagem ACHEI, se o nome estiver entre os 10 nomes lidos anteriormente (guardados no 
vetor), ou NÃO ACHEI caso contrário.
*/

import java.util.Scanner;

public class exercicio_78 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        String[] nomes = new String[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "° nome: ");
            nomes[i] = scan.nextLine();
        }
        
        System.out.println();
        
        System.out.print("Qual nome quer buscar: ");
        String nomeBuscado = scan.nextLine();
        
        boolean encontrou = false;
        
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBuscado)) {
                encontrou = true;
                break;
            }
        }
        
        if (encontrou) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
		
		scan.close();
	}

}
