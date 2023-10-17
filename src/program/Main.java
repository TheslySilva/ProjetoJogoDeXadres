package programa;

import xadrez.PartidaDeXadrez;
import programa.UI;

public class Main {
	
	public static void main(String[] args) {
		
		PartidaDeXadrez partidadexadrez= new PartidaDeXadrez();
		UI.imprimirTabuleiro(partidadexadrez.getPecas());
	}
}