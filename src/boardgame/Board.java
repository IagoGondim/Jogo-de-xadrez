package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rown, int columns) {
		this.rows = rown;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
}
