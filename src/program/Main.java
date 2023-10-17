package programa;

import xadrez.PartidaDeXadrez;
import programa.UI;

public class Main {
	
	public static void main(String[] args) {
		
		//Imprimindo o Tabuleiro
		PartidaDeXadrez partidadexadrez= new PartidaDeXadrez();
		UI.imprimirTabuleiro(partidadexadrez.getPecas());
	}
}