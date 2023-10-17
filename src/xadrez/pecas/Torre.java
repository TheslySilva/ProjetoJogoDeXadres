package xadrez.pecas;

import xadrez.PecaDeXadrez;
import tabuleiro.Tabuleiro;
import xadrez.Cor;

public class Torre extends PecaDeXadrez{
	
	//Construtor
	public Torre (Tabuleiro tabuleiro, Cor cor ){
		super(tabuleiro,cor);
		
	}
	
	//ToString
	@Override
	public String toString(){
		return "T";
	}
}