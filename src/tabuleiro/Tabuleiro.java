package tabuleiro;

public class Tabuleiro {
	
	private int linha;
	private int coluna;
	
	//Construtor
	public Tabuleiro(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	//Get e Set
	public void setLinha(int linha) {
		this.linha = linha;
	}
	
	public int getLinha() {
		return this.linha;
	}
	
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	public int getColuna() {
		return this.coluna;
	}
	
	//Sobreposicao
	@Override()
	public String toString() {
		return "(" + linha + ", " + coluna + ")";
	}
}