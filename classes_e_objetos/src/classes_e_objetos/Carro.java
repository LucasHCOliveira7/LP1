package classes_e_objetos;

public class Carro {

	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	private String cor;
	private double preco;
	private int velocidade;
	
	public Carro(String marca, String modelo, int ano, String placa, String cor, double preco, int velocidade) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.preco = preco;
		this.velocidade = velocidade;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void status() {
		System.out.println("INFORMAÇÕES DO CARRO");
		System.out.println("Marca e Modelo: " + this.marca + " " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano: " + this.ano);
		System.out.println("Valor: R$ " + this.preco);
		System.out.println("Velocidade atual: " + this.velocidade + "Km/h");
	}
	
	public void andando() {
		if (this.velocidade > 0) {
			System.out.println("O carro está em movimento!");
		}
	}
	
	public void parado() {
		if (this.velocidade == 0) {
			System.out.println("O carro está parado!");
		}
	}
	
	public void levarMulta() {
		if (velocidade > 110) {
			System.out.println("Você foi multado! Pois ultrapassou o limite de velocidade");
		} else {
			System.out.println("Mantenha a velocidade e aproveite a viagem");
		}
	}
}
