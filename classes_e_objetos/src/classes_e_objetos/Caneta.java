package classes_e_objetos;

	/*
	Modelos: Esferográfica, Esferográfica Gel, Hidrográfica, Hidrográfica Brush Pen, Tinteiro
	Cor: ...
	Ponta: 0,7mm para traços ultrafinos
	       0,8mm para traços finos
	       1,0mm e 1,2mm para traços médios
	       1,6mm para traços grossos
	Carga: de 0 a 100
	Tampada: true or false
	*/

public class Caneta {
	
	private String modelo; 
	private String cor;
	private double ponta;
	private int carga;
	private boolean tampada;
	
	public Caneta(String modelo, String cor, double ponta, int carga, boolean tampada) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = carga;
		this.tampada = tampada;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getPonta() {
		return ponta;
	}
	
	public void setPonta(double ponta) {
		this.ponta = ponta;
	}
	
	public int getCarga() {
		return carga;
	}
	
	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public boolean getTampada() {
		return tampada;
	}
	
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	public void escrever() {
		if (this.tampada == true) {
			System.out.println("Não posso escrever pois a caneta está tampada!");
		} else {
			System.out.println("Estou escrevendo!");
		}
	}
	
	public void tracos() {
		if (this.ponta == 0.7) {
			System.out.println("Essa caneta é utilizada para traços ultrafinos");
		} else if (this.ponta == 0.8) {
			System.out.println("Essa caneta é utilizada para traços finos");
		} else if (this.ponta == 1.0 || this.ponta == 1.2) {
			System.out.println("Essa caneta é utilizada para traços médios");
		} else { // 1.8
			System.out.println("Essa caneta é utilizada para traços grossos");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("INFORMAÇÕES DA CANETA");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga + "%");
		System.out.println("Está tampada? " + this.tampada);
	}
	
	
}


