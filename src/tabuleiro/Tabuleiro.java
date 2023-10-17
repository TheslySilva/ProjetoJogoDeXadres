package tabuleiro;

public class Tabuleiro(){
	
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
	public void setLinhas(int linhas ){
		this.linhas = linhas;
	}
	public int getLinhas(){
		return this.linhas;
	}
	
	public void setColunas(int colunas ){
		this.colunas= colunas;
	}
	public int getColunas(){
		return this.colunas;
	}
	
}