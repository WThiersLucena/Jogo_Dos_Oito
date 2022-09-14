package JogoDos8;

import java.util.Scanner;

import Funcoes.Controle;
import Funcoes.Intro;

public class Main {
	
	    @SuppressWarnings("unused") // ou trabalha com o SuppressWarnings ou apenas feche ao final [Ex: sc.close();] 
		public static void main(String[] args) {
	    	Intro intro = new Intro();
	    	Main.saldacao();
	    	Main.inicioPrograma();
	    	Scanner input = new Scanner(System.in);
	    	input.close();
	    	}

	    	public static void saldacao() {
	    		Intro intro = new Intro();        	
	        	Scanner sc = new Scanner(System.in);
	        	intro.msgInicio(); 
//	        	sc.close();
	    	}
			
	    	public static void inicioPrograma() {
	    		Intro intro = new Intro();    		
	    		Scanner sc = new Scanner(System.in);
	    	
			System.out.println("Digite :");
			System.out.println("       [ S ] - Para iniciarmos");
			System.out.println("       [ N ] - Finalizar");
			
			char iniciar = sc.next().charAt(0);
			
			if (iniciar == 's' || iniciar == 'S') {
			
				Controle.entrada();

			} else if (iniciar == 'n' || iniciar == 'N') {
				
				System.out.println("\n Ok obrigado volte sempre...!");
				
				intro.ateLogo();
				
			} else {
				
				System.out.println("\n Opção Invalida tente novamente");
				
				Main.inicioPrograma();
			}
			
	    	sc.close();
	    }

}
