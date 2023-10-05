package classes_e_objetos;

public class Pessoa {

	String nome;
	String rg;
	String cpf;
	String telefone;
	int idade;
	double altura;
	double peso;
	String cor;
	String nacionalidade;
	
	void status() {
		System.out.println("INFORMAÇÕES DA PESSOA");
		System.out.println("Nome: " + this.nome);
		System.out.println("Tem " + this.idade + " anos de idade");
		System.out.println("É uma pessoa " + this.cor);
		System.out.println("Altura: " + this.altura);
		System.out.println("Peso: " + this.peso);
		System.out.println("Nacionalidade: " + this.nacionalidade);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("RG: " + this.rg);
		System.out.println("CPF: " + this.cpf);
	}
		
	void trabalhar() {
		if (idade >= 14 && idade <= 18) {
			System.out.println("Você tem idade para ser jovem aprendiz!");
		} else if (idade < 14) {
			System.out.println("Ainda é muito novo para trabalhar!");
		} else {
			System.out.println("Já é maior de idade, vai arrumar um emprego!");
		}
	}
	
	void treinar() {
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
