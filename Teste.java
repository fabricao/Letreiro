package desafios.banks.desafio02;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String palavra;
		
		System.out.println("Digite uma palavra: ");
		palavra = scan.nextLine();
		
		ConsultaArquivo.verificaCaracter(palavra);
	}

}
