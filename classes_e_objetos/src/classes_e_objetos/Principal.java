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
		
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("");
		
		Filme f1 = new Filme();
		f1.titulo = "Top Gun Maverick";
		f1.duracao = 131;
		f1.anoLancamento = 2022;
		f1.genero = "Ação/Aventura";
		f1.classificacao = "12";
		f1.avaliacao = 9.5;
		f1.sinopse = "Depois de mais de 30 anos de serviço como um dos principais aviadores da Marinha, \n"
				+ "Pete \"Maverick\" Mitchell está de volta, rompendo os limites como um piloto de testes corajoso. \n"
				+ "No mundo contemporâneo das guerras tecnológicas, Maverick enfrenta drones e prova que o \n"
				+ "fator humano ainda é essencial.";
		f1.diretor = "Joseph Kosinski";
		f1.status();
		f1.assistir();
		f1.acessar();
		f1.avaliar();
		
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("");
		
        Personagem jogador1 = new Personagem();
        jogador1.nome = "Jogador 1";
        jogador1.vida = 100;
        jogador1.energia = 50;
        jogador1.nivel = 26;
        jogador1.ataque = 35;
        jogador1.defesa = 18;
        
        Personagem jogador2 = new Personagem();
        jogador2.nome = "Jogador 2";
        jogador2.vida = 100;
        jogador2.energia = 50;
        jogador2.nivel = 22;
        jogador2.ataque = 21;
        jogador2.defesa = 13;

        System.out.println("STATUS INICIAL");
        jogador1.Status();
        System.out.println("");
        jogador2.Status();

        // Combate dos jogadores
        System.out.println("\nCOMBATE");
        jogador1.adicionarHabilidade("Bola de Fogo");
        jogador2.adicionarHabilidade("Relâmpago");
        jogador1.atacar(jogador2);
        jogador1.ganharExperiencia(14);
        jogador2.atacar(jogador1);
        jogador2.ganharExperiencia(2);
        jogador1.usarHabilidade(0);
        jogador2.subtrairVida(15);
        System.out.println("Jogador 2 perdeu 15 pontos de vida");
        jogador1.ganharExperiencia(7);
        jogador2.usarHabilidade(0);
        jogador1.subtrairVida(31);
        System.out.println("Jogador 1 perdeu 31 pontos de vida");
        jogador2.ganharExperiencia(17);
        jogador2.defender();
        jogador1.atacar(jogador2);
        jogador1.ganharExperiencia(6);
        jogador2.atacar(jogador1);
        jogador2.ganharExperiencia(2);
        jogador1.atacar(jogador2);
        jogador1.ganharExperiencia(6);
        jogador2.usarHabilidade(0);
        jogador1.subtrairVida(31);
        System.out.println("Jogador 1 perdeu 31 pontos de vida");
        jogador2.ganharExperiencia(17);
        jogador1.defender();
        jogador2.atacar(jogador1);
        jogador1.recuperarVida(10);
        System.out.println("Jogador 1 utilizou 25 pontos de experiência para recuperar vida");
        jogador2.adicionarHabilidade("Ataque Especial");
        jogador1.atacar(jogador2);
        jogador2.usarHabilidade(1);
        jogador1.subtrairVida(40);
        System.out.println("Jogador 1 perdeu 40 pontos de vida");
        jogador1.defender();
        jogador2.usarHabilidade(0);
        jogador1.subtrairVida(40);
        System.out.println("Jogador 1 perdeu 40 pontos de vida");
        jogador1.subtrairVida(0);
        System.out.println("VITÓRIA DO JOGADOR 2");
        jogador2.subirNivel();

        // Status após o combate
        System.out.println("\nSTATUS APÓS COMBATE");
        jogador1.Status();
        System.out.println("");
        jogador2.Status();
		
        
        System.out.println("");
		System.out.println("==================================================");
		System.out.println("");
	}

}
