package exercicios;

import java.util.Random;

public class exercicio_85 {

	public static void main(String[] args) {
		
		// Faça um algoritmo para ler e armazenar em um vetor a temperatura média de todos os dias do ano. 
		// Calcular e escrever: 
		//	a) Menor temperatura do ano 
		//	b) Maior temperatura do ano 
		//	c) Temperatura média anual 
		//	d) O número de dias no ano em que a temperatura foi inferior a média anual 

		Random random = new Random();

        int diasNoAno = 365;
        double[] temperaturas = new double[diasNoAno];
        double somaTemperaturas = 0;

        for (int i = 0; i < diasNoAno; i++) {
            temperaturas[i] = -10 + random.nextDouble() * (40 - (-10));
            somaTemperaturas += temperaturas[i];
        }

        double mediaAnual = somaTemperaturas / diasNoAno;

        double menorTemperatura = temperaturas[0];
        double maiorTemperatura = temperaturas[0];

        for (int i = 1; i < diasNoAno; i++) {
            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
            }
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
            }
        }

        int diasInferioresMediaAnual = 0;
        for (int i = 0; i < diasNoAno; i++) {
            if (temperaturas[i] < mediaAnual) {
                diasInferioresMediaAnual++;
            }
        }

        System.out.printf("Menor temperatura do ano: %.1f\n", menorTemperatura);
        System.out.printf("Maior temperatura do ano: %.1f\n", maiorTemperatura);
        System.out.printf("Temperatura média anual: %.1f\n", mediaAnual);
        System.out.println("Número de dias em que a temperatura foi inferior à média anual: " + diasInferioresMediaAnual);
	}

}
