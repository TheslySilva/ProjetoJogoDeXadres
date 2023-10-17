package xadrez.pecas;

import xadrez.PecaDeXadrez;
import tabuleiro.Tabuleiro;
import xadrez.Cor;

public class Rei extends PecaDeXadrez{
	
	//Construtor
	public Rei (Tabuleiro tabuleiro, Cor cor ){
		super(tabuleiro,cor);
		
	}
	
	//ToString
	@Override
	public String toString(){
		return "R";
	}
}