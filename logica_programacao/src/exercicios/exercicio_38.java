package exercicios;

import java.util.Scanner;

public class exercicio_38 {

	public static void main(String[] args) {
		
		// Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja 
		// diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a 
		// mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se 
		// esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a 
		// senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.
		
		Scanner scan = new Scanner(System.in);

		int codigoUsuario = 0;
		int senhaUsuario = 0;
		
		while (codigoUsuario != 1234) {
			System.out.print("Digite o código de usuário: ");
			codigoUsuario = scan.nextInt();
			if (codigoUsuario == 1234) {
				while (senhaUsuario != 9999) {
					System.out.print("Digite a senha: ");
					senhaUsuario = scan.nextInt();
					if (senhaUsuario == 9999) {
						System.out.println("Acesso Permitido!");
					} else {
						System.out.println("Senha Incorreta! Tente Novamente.");
					} //else
				} //while
			} else {
				System.out.println("Usuário Inválido! Tente novamente.");
			} //else
		} //while
		
		scan.close();
	}

}
