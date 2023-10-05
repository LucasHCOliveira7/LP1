package classes_e_objetos;

public class Carro {

	String marca;
	String modelo;
	int ano;
	String placa;
	String cor;
	double preco;
	int velocidade;
	
	
	void andando() {
		if (this.velocidade > 0) {
			System.out.println("O carro está em movimento!");
		}
	}
	
	void parado() {
		if (this.velocidade == 0) {
			System.out.println("O carro está parado!");
		}
	}
	
	void levarMulta() {
		if (velocidade > 110) {
			System.out.println("Você foi multado! Pois ultrapassou o limite de velocidade");
		} else {
			System.out.println("Mantenha a velocidade e aproveite a viagem");
		}
	}
	
	void status() {
		System.out.println("INFORMAÇÕES DO CARRO");
		System.out.println("Marca e Modelo: " + this.marca + " " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano: " + this.ano);
		System.out.println("Valor: R$ " + this.preco);
		System.out.println("Velocidade atual: " + this.velocidade + "Km/h");
	}
}
