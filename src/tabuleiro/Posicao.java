package tabuleiro;

import tabuleiro.Peca;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	//Construtor
	public Tabuleiro(int linhas,int colunas){
		
		if (linhas<1 || colunas <1){
			throw new TabuleiroException("Erro ao criar tabuleiro: É necessario que haja pelo menos 1 linha e 1 coluna");
		}
		
		this.linhas = linhas;
		this.colunas = colunas;
		pecas= new Peca[linhas][colunas];
		
	}
	
	//Get e Set
	public int getLinha(){
		return this.linhas;
	}
	
	public int getColuna(){
		return this.colunas;
	}
	
	//Sobrecarga
	public Peca peca(int linha,int coluna){
		
		if (!posicaoExistente(linha,coluna)){
			throw new TabuleiroException("A posição não existe no tabuleiro");
		}
		
		return pecas[linha][coluna];
	}
	public Peca peca(Posicao posicao){
		
		if (!posicaoExistente(posicao)){
			throw new TabuleiroException("A posição não existe no tabuleiro");
		}
		
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
		
	//Colocar peca
	public void colocarPeca(Peca peca, Posicao posicao){
		
		if (haUmaPeca(posicao)){
			throw new TabuleiroException("Há uma peça nesta posicão: "+ posicao);
		}
		
		pecas[posicao.getLinha()][posicao.getColuna()]= peca;
		peca.posicao = posicao;
	}
	
	//Verificacao de posicao
	private boolean posicaoExistente(int linha,int coluna){
		
		return linha >=0 && linha < linhas && coluna >=0 && coluna < colunas;
	}
	
	public boolean posicaoExistente(Posicao posicao){
		return posicaoExistente(posicao.getLinha(),posicao.getColuna());
	}
	
	public boolean haUmaPeca(Posicao posicao){
		if (!posicaoExistente(posicao)){
			throw new TabuleiroException("A posição não existe no tabuleiro");
		}
		return peca(posicao) != null;
	}
}