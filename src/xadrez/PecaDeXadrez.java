package xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecaDeXadrez extends Peca{
	
	private Cor cor;
	
	//Construtor
	public PecaDeXadrez(Tabuleiro tabuleiro, Cor cor){
		super(tabuleiro);
		this.cor = cor;
	}
	
	//Get e Set
	public Cor getCor(){
		return this.cor;
	}
}