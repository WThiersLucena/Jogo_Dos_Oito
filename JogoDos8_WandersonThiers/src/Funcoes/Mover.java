package Funcoes;


public class Mover {

	public static String[][] mover(String insert, int[] index, String[][] tabelaEmbaralhada) {

		int[] posicaoValorInserido = Buscador.buscarIndexValorInserido(tabelaEmbaralhada, insert);

		int colunaValorInserido = posicaoValorInserido[1];
		int linhaValorInserido = posicaoValorInserido[0];
		
		int linhaEspacoBranco = index[0];
		int colunaEspacoBranco = index[1];
		String temp;

		if (Verificar.verificarEntrada(linhaEspacoBranco, colunaEspacoBranco, linhaValorInserido,
				colunaValorInserido) == false) {
			System.out.println("\n Valor Invalido! ");
			System.out.println(" Digite um valor valido! \n");

			return tabelaEmbaralhada;
		}

		temp = tabelaEmbaralhada[linhaEspacoBranco][colunaEspacoBranco];
		tabelaEmbaralhada[linhaEspacoBranco][colunaEspacoBranco] = tabelaEmbaralhada[linhaValorInserido][colunaValorInserido];
		tabelaEmbaralhada[linhaValorInserido][colunaValorInserido] = temp;

		return tabelaEmbaralhada;

	}

}
