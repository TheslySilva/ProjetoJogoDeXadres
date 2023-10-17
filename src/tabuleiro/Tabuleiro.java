package tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] peca;
	
	//Construtor
	public Tabuleiro(int linhas,int colunas){
		
		this.linhas = linhas;
		this.colunas = colunas;
		peca= new Peca[linhas][colunas];
		
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
		return peca[linha][coluna];
	}
	public Peca peca(Posicao posicao){
		return peca[posicao.getLinha()][posicao.getColuna()];
	}
}