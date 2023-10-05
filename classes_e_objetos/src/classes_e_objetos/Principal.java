package classes_e_objetos;

public class Principal {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		c1.modelo = "Esferográfica";
		c1.cor = "Azul";
		c1.ponta = 0.8;
		c1.carga = 80;
		c1.tampar();
		c1.status();
		c1.tracos();
		c1.escrever();
		
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("");
		
		Carro car1 = new Carro();
		car1.marca = "Dodge";
		car1.modelo = "Charger RT";
		car1.ano = 1970;
		car1.cor = "Preto";
		car1.placa = "BRA2X87";
		car1.preco = 375000;
		car1.velocidade = 110;
		car1.status();
		car1.andando();
		car1.levarMulta();
		
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("");
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Lucas Henrique";
		p1.idade = 21;
		p1.cor = "branca";
		p1.altura = 1.86;
		p1.peso = 90.7;
		p1.nacionalidade = "Brasileiro";
		p1.telefone = "(12) 98765-4321";
		p1.rg = "123.456.789-X";
		p1.cpf = "987.654.321-00";
		p1.status();
		p1.trabalhar();
		p1.treinar();
	}

}
