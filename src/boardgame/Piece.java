package boardgame;

public class Piece {

	protected Position position; // Matrix position
	private Board board;  // Association piece -- board
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
}
