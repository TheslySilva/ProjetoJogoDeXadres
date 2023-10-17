package tabuleiro;

public class Peca {
	
	private Posicao posicao;
	private Tabuleiro tabuleiro;
	
	//Construtor
	public Peca(Tabuleiro tabuleiro){
		this.tabuleiro = tabuleiro;
	}
	
	//Get e Set 
	private Tabuleiro getTabuleiro(){ 
		return this.tabuleiro;
	}
}