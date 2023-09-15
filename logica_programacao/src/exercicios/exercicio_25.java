package exercicios;

import java.util.Scanner;

public class exercicio_25 {

	public static void main(String[] args) {
		
		// Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e 
		// escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior 
		// ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.

		Scanner leitura = new Scanner(System.in);
		
		int numConta;
		double saldo;
		double debito;
		double credito;
		double saldoAtual;
		
		System.out.print("Qual o número da conta: ");
		numConta = leitura.nextInt();
		
		System.out.print("Qual o saldo da conta: ");
		saldo = leitura.nextDouble();
		
		System.out.print("Qual o débito que o cliente deve: ");
		debito = leitura.nextDouble();
		
		System.out.print("Qual o crédito que o cliente tem: ");
		credito = leitura.nextDouble();
		
		saldoAtual = saldo - debito + credito;
		
		if (saldoAtual >= 0) {
			System.out.println("a conta está com SALDO POSITIVO!");
		} else {
			System.out.println("A conta está com SALDO NEGATIVO!");
		}
		
		leitura.close();
		
	}

}
