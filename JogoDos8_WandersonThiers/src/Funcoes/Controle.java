package Funcoes;

import java.util.Scanner;

import Tabela.Tabela;

public class Controle {

	public static void entrada() {
		Intro intro = new Intro();
		String tabelaEmbaralhada[][];	
	
		String tabelaObjetivo[][];
				
		Object[] retorno;
		
		boolean y;

		y = false;
		tabelaObjetivo = Tabela.criarTabela();
		intro.inicioDeJogo();
		
		MostrarTabela.exibirTabela(tabelaObjetivo);
		System.out.println("\n");

		tabelaEmbaralhada = Embaralhar.embaralhar(tabelaObjetivo);

		while (y == false) {
			intro.msgEmbaralhar();
			MostrarTabela.exibirTabela(tabelaEmbaralhada);
			System.out.println("Voc? pode mover apenas os n?mero ao redor do 'vazio'.");
			System.out.println("\n");

			Scanner s = new Scanner(System.in);
			System.out.println("Inserir numero: \n");
			String i = s.next();

			retorno = jogar(i, tabelaEmbaralhada);
			if ((boolean) retorno[1] == true) {
				intro.fimDeJogo();
				MostrarTabela.exibirTabela((String[][]) retorno[0]);
				y = true;
			} else {
				y = (boolean) retorno[1];
				tabelaEmbaralhada = (String[][]) retorno[0];

			}
		}
	}

	public static Object[] jogar(String insert, String tabelaEmbaralhada[][]) {
		int[] index = Buscador.buscarIndexEspaco(tabelaEmbaralhada);
		boolean resultado = Verificar.verificarSeGanhou(tabelaEmbaralhada);
		String[][] arrayModificado = Mover.mover(insert, index, tabelaEmbaralhada);
		Object[] retorno = new Object[2];

		if (resultado == false) {
			retorno[0] = arrayModificado;
			retorno[1] = false;
			return retorno;
		} else {
			retorno[0] = arrayModificado;
			retorno[1] = true;
			return retorno;
		}
	}
}
