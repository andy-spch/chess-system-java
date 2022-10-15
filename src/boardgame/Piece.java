package boardgame;

public class Piece {
	protected Position position;
	private Board board;

	public Piece(Board board) {
		super();
		this.board = board;
	}
	
	// Não podemos alterar o Board, portanto não precisa de SET
	// Protegido, pois será utilizado apenas pelo tabuleiro e pelas peças
	protected Board getBoard() {
		return board;
	}
}
