package classes_e_objetos;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("");
		
		Caneta caneta1 = new Caneta(null, null, 0, 0, false);
		caneta1.setModelo("Esferográfica");
		caneta1.setCor("Azul");
		caneta1.setPonta(0.8);
		caneta1.setCarga(80);
		caneta1.tampar();
		caneta1.status();
		caneta1.tracos();
		caneta1.escrever();
		
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("");
		
		Carro carro1 = new Carro(null, null, 0, null, null, 0, 0);
		carro1.setMarca("Dodge");
		carro1.setModelo("Charger R/T");
		carro1.setAno(1970);
		carro1.setCor("Preto");
		carro1.setPlaca("BRA2X87");
		carro1.setPreco(375000);
		carro1.setVelocidade(130);
		carro1.status();
		carro1.andando();
		carro1.levarMulta();
		
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("");
		
		Pessoa pessoa1 = new Pessoa(null, null, null, null, 0, 0, 0, null, null);
		pessoa1.setNome("Lucas Henrique");
		pessoa1.setIdade(21);
		pessoa1.setCor("branca");
		pessoa1.setAltura(1.86);
		pessoa1.setPeso(90.7);
		pessoa1.setNacionalidade("Brasileiro");
		pessoa1.setTelefone("(12) 98765-4321");
		pessoa1.setRg("123.456.789-X");
		pessoa1.setCpf("987.654.321-00");
		pessoa1.status();
		pessoa1.trabalhar();
		pessoa1.treinar();
		
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("");
		
		Filme filme1 = new Filme(null, null, null, 0, 0, null, null, 0);
		filme1.setTitulo("Top Gun Maverick");
		filme1.setDuracao(131);
		filme1.setAnoLancamento(2022);
		filme1.setGenero("Ação/Aventura");
		filme1.setClassificacao("12");
		filme1.setAvaliacao(9.5);
		filme1.setSinopse("Depois de mais de 30 anos de serviço como um dos principais aviadores da Marinha, \n"
				+ "Pete \"Maverick\" Mitchell está de volta, rompendo os limites como um piloto de testes corajoso. \n"
				+ "No mundo contemporâneo das guerras tecnológicas, Maverick enfrenta drones e prova que o \n"
				+ "fator humano ainda é essencial.");
		filme1.setDiretor("Joseph Kosinski");
		filme1.status();
		filme1.assistir();
		filme1.acessar();
		filme1.avaliar();
        
        System.out.println("");
		System.out.println("==================================================");
		System.out.println("");
		
		System.out.println("LIVROS DA BIBLIOTECA");
		
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.cadastrarLivro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
		biblioteca.cadastrarLivro("O Hobbit", "J. R. R. Tolkien", 1937);
		biblioteca.cadastrarLivro("Jogador Número 1", "Ernest Cline", 2011);
		biblioteca.cadastrarLivro("1984", "George Orwell", 1949);
		biblioteca.cadastrarLivro("A Revolução dos Bichos", "George Orwell", 1945);
		biblioteca.cadastrarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
		biblioteca.cadastrarLivro("Cristianismo Puro e Simples", "C. S. Lewis", 1952);
		biblioteca.cadastrarLivro("A Abolição do Homem", "C. S. Lewis", 1943);
		biblioteca.cadastrarLivro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 1997);
		biblioteca.cadastrarLivro("Harry Potter e a Câmara Secreta", "J. K. Rowling", 1998);
		biblioteca.cadastrarLivro("Harry Potter e o Prisioneiro de Azkaban", "J. K. Rowling", 1999);
		biblioteca.cadastrarLivro("Harry Potter e o Cálice de Fogo", "J. K. Rowling", 2000);
		biblioteca.cadastrarLivro("Harry Potter e a Ordem da Fênix", "J. K. Rowling", 2003);
		biblioteca.cadastrarLivro("Harry Potter e o Enigma do Príncipe", "J. K. Rowling", 2005);
		biblioteca.cadastrarLivro("Harry Potter e as Relíquias da Morte", "J. K. Rowling", 2007);
		
		biblioteca.mostrarLivros();
		
		System.out.println();
		System.out.println("LIVROS REMOVIDOS");
		
		biblioteca.removerLivro("Harry Potter e o Prisioneiro de Azkaban");
		biblioteca.removerLivro("Jogador Número 1");
		biblioteca.removerLivro("O Pequeno Príncipe");
		
		biblioteca.mostrarLivros();
		
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("");
	}
}
