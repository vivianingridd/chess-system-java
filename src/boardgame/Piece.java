package boardgame;

public class Piece {
	
	protected Position position; //posi��o simples de matriz
	private Board board;
	//associacao das pecaas com o tabuleiro
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
}
