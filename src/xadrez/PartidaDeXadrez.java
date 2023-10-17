package xadrez;

import tabuleiro.Tabuleiro;
import tabuleiro.Posicao;
import  xadrez.pecas.Torre;
import  xadrez.pecas.Rei;
import xadrez.Cor;

public class PartidaDeXadrez{
	
	private Tabuleiro tabuleiro;
	
	//Construtor
	public PartidaDeXadrez(){
		tabuleiro = new Tabuleiro(8,8);
		iniciarEstado();
	}
	
	public PecaDeXadrez[][] getPecas(){
		
		PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinha()][tabuleiro.getColuna()];
		
		for (int l=0 ; l<tabuleiro.getLinha() ; l++ ){ 
			for(int c=0 ; c<tabuleiro.getColuna() ; c++){
			
			mat[l][c]= (PecaDeXadrez) tabuleiro.peca(l,c);
			
		}
	 }
	 return mat;
	}
	
	//
	private void iniciarEstado(){
		tabuleiro.colocarPeca(new Torre(tabuleiro,Cor.BRANCO) , new Posicao(2,1));
		tabuleiro.colocarPeca(new Rei(tabuleiro,Cor.PRETO), new Posicao(0,4));
	}
}