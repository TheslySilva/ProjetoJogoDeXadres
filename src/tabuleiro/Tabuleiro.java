package tabuleiro;

import tabuleiro.Peca;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	//Construtor
	public Tabuleiro(int linhas,int colunas){
		
		this.linhas = linhas;
		this.colunas = colunas;
		pecas= new Peca[linhas][colunas];
		
	}
	
	//Get e Set
	public void setLinha(int linhas ){
		this.linhas = linhas;
	}
	public int getLinha(){
		return this.linhas;
	}
	
	public void setColuna(int colunas ){
		this.colunas= colunas;
	}
	public int getColuna(){
		return this.colunas;
	}
	
	//Sobrecarga
	public Peca peca(int linha,int coluna){
		return pecas[linha][coluna];
	}
	public Peca peca(Posicao posicao){
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
		
	//Colocar peca
	public void colocarPeca(Peca peca, Posicao posicao){
		pecas[posicao.getLinha()][posicao.getColuna()]= peca;
		peca.posicao = posicao;
	}
}