package program;

import xadrez.PartidaDeXadrez;
import program.UI;

public class Main {
	
	public static void main(String[] args) {
		PartidaDeXadrez partidadexadrez = new PartidaDeXadrez();
		UI.imprimirTabuleiro(partidadexadrez.getPecas());
		
		System.out.println("Fazendo um teste ");
	}
}