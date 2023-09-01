package exercicios;

import java.util.Scanner;

public class exercicio_8 {

	public static void main(String[] args) {
		
		// Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos 
		// brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total 
		// de eleitores.

		Scanner leitura = new Scanner(System.in);
		
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = leitura.nextInt();
        
        int restoVotos = totalEleitores;
        
        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = leitura.nextInt();
        
        while (restoVotos != 0) {
        	
            if (votosBrancos > totalEleitores) {
            	System.out.println("Inválido! Os votos não podem ser maior que o total de eleitores");
            }
            else if (votosBrancos <= totalEleitores) {
            	System.out.println();
            	System.out.println("Total de eleitores = " + totalEleitores);
            	System.out.println(votosBrancos + " eleitores votaram em branco");
            	
            	restoVotos = totalEleitores - votosBrancos;
            	System.out.println("Restam " + restoVotos + " votos para analisar");
            	System.out.println();
            	
            	System.out.print("Digite o total de votos nulos: ");
            	int votosNulos = leitura.nextInt();
            	
            	if (votosNulos > restoVotos) {
            		System.out.println("Inválido! Os votos não podem ser maior do que o restante");
            	}
            	else if (votosNulos <= restoVotos) {
            		System.out.println();
            		System.out.println("Total de eleitores = " + totalEleitores);
            		System.out.println(votosBrancos + " eleitores votaram em branco");
            		System.out.println(votosNulos + " eleitores votaram nulo");
            		
            		restoVotos -= votosNulos;
            		int votosValidos = restoVotos;
            		System.out.println(votosValidos + " eleitores tiveram votos validos");
            		System.out.println();
            		
            		double percentualBrancos = (votosBrancos * 100.0) / totalEleitores;
                    double percentualNulos = (votosNulos * 100.0) / totalEleitores;
                    double percentualValidos = (votosValidos * 100.0) / totalEleitores;
                    
                    System.out.printf("Percentual de votos brancos: %.2f\n", percentualBrancos, " %");
                    System.out.printf("Percentual de votos nulos: %.2f\n", percentualNulos, " %");
                    System.out.printf("Percentual de votos válidos: %.2f\n", percentualValidos, " %");
                    
                    restoVotos = restoVotos - votosValidos;
            	}
            }
        }
	}
}
