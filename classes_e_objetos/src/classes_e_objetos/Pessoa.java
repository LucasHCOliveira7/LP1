package classes_e_objetos;

public class Pessoa {

	private String nome;
	private String rg;
	private String cpf;
	private String telefone;
	private int idade;
	private double altura;
	private double peso;
	private String cor;
	private String nacionalidade;
	
	public Pessoa(String nome, String rg, String cpf, String telefone, int idade, double altura, double peso, String cor, String nacionalidade) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.cor = cor;
		this.nacionalidade = nacionalidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public void status() {
		System.out.println("INFORMAÇÕES DA PESSOA");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade + " anos");
		System.out.println("Cor: " + this.cor);
		System.out.println("Altura: " + this.altura);
		System.out.println("Peso: " + this.peso);
		System.out.println("Nacionalidade: " + this.nacionalidade);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("RG: " + this.rg);
		System.out.println("CPF: " + this.cpf);
	}
		
	public void trabalhar() {
		if (idade >= 14 && idade <= 18) {
			System.out.println("Você tem idade para ser jovem aprendiz!");
		} else if (idade < 14) {
			System.out.println("Ainda é muito novo para trabalhar!");
		} else {
			System.out.println("Já é maior de idade, vai arrumar um emprego!");
		}
	}
	
	public void treinar() {
		double imc = this.peso / (this.altura * 2);
		
		System.out.println("De acordo com o seu IMC:");
		
		if (imc < 18.5) {
			System.out.println("Você está abaixo do peso, melhore a alimentação e procure um personal");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Você está com peso normal, continue assim!");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Você está com excesso de peso, melhore a alimentação e volte a treinar");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Você está com obesidade!!! Recomendo melhorar a alimentação e começar a treinar");
		} else if (imc >= 35) {
			System.out.println("Você está com obesidade extrema!!! Procure um especialista e melhore sua qualidade de vida");
		}
	}
}
