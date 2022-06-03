package boardgame;

//pacote correspondente a camada de tabuleiro

public class Position {
	
	private int row; //atributo linha e coluna
	
	private int column;

	public Position(int row, int column)  {
		this.row = row;
		this.column = column;
	} //construtor

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override  //toString para imprimir a posicao na tela
	public String toString() {
		
		return row + "," + column; //imprimir linha com a coluna
	}
	
}
