package desafios.banks.desafio02;

import java.io.File;
import java.io.IOException;
import org.ini4j.*;

public class ConsultaArquivo {

	//ARRAY DO TAMANHO DA MATRIZ CONTIDA NO ARQUIVO INI
	private static char[][] letras = new char[7][5];

	//METODO QUE RECEBE A PALAVRA DIGITADA E COMPARA COM AS CONSTANTES NO ENUM E INFORMA PARA OUTRO METODO
	//O INDICE REFERENTE A CADA CARACTER DA PALAVRA DIGITADA
	// O ATRIBUTO BOOLEANO EH PARA INDICAR QUEBRA DE LINHA
	public static void verificaCaracter(String palavra) {
		char[] letrasDaPalavra = palavra.toCharArray();
		boolean auxilioPQuebraLinha;

		for (int k = 0; k < 7; k++) {

			for (int i = 0; i < letrasDaPalavra.length; i++) {
				if (i == 6) {
					auxilioPQuebraLinha = true;
					imprimiremBits(Alfabeto.getAlfabetoByChar(letrasDaPalavra[i]).getindice(), k, auxilioPQuebraLinha);
				}
				else {
					auxilioPQuebraLinha = false;
					imprimiremBits(Alfabeto.getAlfabetoByChar(letrasDaPalavra[i]).getindice(), k, auxilioPQuebraLinha);

				}
			}

		}

	}

	
	/*
	 * METODO QUE RECEBE OS INDICES E PREENCHE O ARRAY COM AS INFORMAÇÕES DO ARQUIVO INI
	 */
	public static void imprimiremBits(int indiceletra, int auxiliar, boolean vaiQbraLinha) {

		try {

			int aux = auxiliar;

			Wini ini = new Wini(new File("D:\\Java\\ProjEstudos\\Exercicios\\src\\desafios\\banks\\desafio02\\letras.ini"));
			String pegaLinhaIni;
			char[] pegaLetrasTemp = new char[5];

			for (int i = 0; i < letras.length; i++) {

				pegaLinhaIni = ini.get(String.valueOf(indiceletra), String.valueOf(i + 1), String.class);
				pegaLetrasTemp = pegaLinhaIni.toCharArray();

				for (int j = 0; j < letras[i].length; j++) {

					letras[i][j] = pegaLetrasTemp[j];

				}
			}

			processarLetra(letras, aux);

			if (vaiQbraLinha) {
				System.out.println();
			}

		}
		catch (IOException e) {
			System.out.println("CARACTER ESPECIAL INVALIDO OU PALAVRA INEXISTENTE.");
		}
	}

	/*
	 * METODO QUE IMPRIMI DE ACORDO COM AS INFORMAÇÕES DO ARRAY
	 * A IMPRESSSAO EH FEITA IMPRIMINDO LINHA A LINHA DE TODOS OS CARACTERES CONTIDOS NA PALAVRA INFORMADA
	 */
	public static void processarLetra(char[][] finalmente, int position) {

		String linha = "";

		for (int j = 0; j < finalmente[position].length; j++) {

			if (finalmente[position][j] == '0') {

				linha += " ";

			}
			else {

				linha += "\u2588";

			}

		}

		System.out.print(linha + "   ");

	}

}
