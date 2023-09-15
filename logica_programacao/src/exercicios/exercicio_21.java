package exercicios;

import java.util.Scanner;

public class exercicio_21 {

	public static void main(String[] args) {
		
		// Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os 
		// minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é 
	    // de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. 

		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite a hora de início da partida (hora inteira): ");
		int horaInicio = leitura.nextInt();
		
		System.out.print("Digite a hora de fim da partida (hora inteira): ");
		int horaFim = leitura.nextInt();
		
		int duracaoPartida;
		
		if (horaInicio < horaFim) {
			duracaoPartida = horaFim - horaInicio;
		} else {
			duracaoPartida = 24 - horaInicio + horaFim;
		}
		
		System.out.println("A duração da partida é de " + duracaoPartida + " horas.");
		
		leitura.close();
		
	}

}
