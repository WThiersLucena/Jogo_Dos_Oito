package Funcoes;

public class MostrarTabela {

	public static void exibirTabela(String[][] array) {

		int a, b;

		for (a = 0; a <= 2; a++) {
			
			for (b = 0; b <= 2; b++) {
				
				System.out.print(array[a][b] + "\t");
				
			}
			
			System.out.println();
		}
	}

}
