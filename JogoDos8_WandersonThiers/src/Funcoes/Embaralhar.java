package Funcoes;

import java.util.Random;

public class Embaralhar {

	public static String[][] embaralhar(String[][] tabelaObjetivo) {

		Random random = new Random();
		int length = tabelaObjetivo.length + 1;

		for (int j = 0; j < (tabelaObjetivo.length - 1); j++) {
			for (int i = 0; i < tabelaObjetivo.length; i++) {

				// sorteia um Indice
				int l = random.nextInt(tabelaObjetivo.length);
				int k = random.nextInt(tabelaObjetivo.length);

				// troca o posição dos indices i e j do vetor
				String temp = tabelaObjetivo[i][j];
				tabelaObjetivo[i][j] = tabelaObjetivo[k][l];
				tabelaObjetivo[k][l] = temp;
			}
		}

		return tabelaObjetivo;

	}

}
