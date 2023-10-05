package classes_e_objetos;

public class Filme {

	String titulo;
	String genero;
	String diretor;
	int anoLancamento;
	int duracao;
	String classificacao;
	String sinopse;
	double avaliacao;
	
	void status() {
		System.out.println("INFORMAÇÕES DO FILME");
		System.out.println("Título: " + this.titulo);
		System.out.println("Duração: " + this.duracao + "min");
		System.out.println("Ano de Lançamento: " + this.anoLancamento);
		System.out.println("Gênero: " + this.genero);
		System.out.println("Sinopse: " + this.sinopse);
		System.out.println("Classificação: " + this.classificacao);
		System.out.println("Avaliação: " + this.avaliacao);
		System.out.println("Diretor: " + this.diretor);
	}
	
	void assistir() {
		if (anoLancamento > 2023) {
			System.out.println("Esse filme ainda não está disponível para assistir!");
		} else {
			System.out.println("O filme já está disponível para assistir!");
		}
	}
	
	void acessar() {
		if (classificacao == "18") {
			System.out.println("Esse filme possui conteúdo violento e sexual extremos. Cenas de sexo, incesto \n"
					+ "ou atos repetidos de tortura, mutilação ou abuso sexual.");
		} else if (classificacao == "16") {
			System.out.println("Esse filme possui conteúdo mais violento ou com conteúdo sexual mais intenso, \n"
					+ "com cenas de tortura, suicídio, estupro ou nudez total.");
		} else if (classificacao == "14") {
			System.out.println("Esse filme possui conteúdos mais violentos e/ou de linguagem \n"
					+ "sexual mais acentuada.");
		} else if (classificacao == "12") {
			System.out.println("Esse filme pode conter cenas de agressão física, consumo de drogas \n"
					+ "e/ou incinuação sexual.");
		} else if (classificacao == "10") {
			System.out.println("Esse filme possui conteúdo violento ou linguagem inapropriada para \n"
					+ "crianças, ainda que em menor intensidade.");
		} else if (classificacao == "L" || classificacao == "Livre") {
			System.out.println("Esse filme não expõe crianças a conteúdo potencialmente prejudiciais.");
		}
	}
	
	void avaliar() {
		if (avaliacao >= 8) {
			System.out.println("O filme recebou uma ótima avaliação");
		} else if (avaliacao >= 6) {
			System.out.println("O filme recebeu uma avaliação mediana");
		} else if (avaliacao > 4) {
			System.out.println("O filme não foi muito aceito pelo público");
		} else {
			System.out.println("O público odiou o filme!!");
		}
	}
	
}
