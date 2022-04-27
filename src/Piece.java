import java.util.ArrayList;


public abstract class Piece {
	
	String name;
	
	public int row;
	public int col;
	
	public int value;
	
	public boolean isWhite = true;
	public boolean isKing = false;
	
	ArrayList<String> possibleMoves; // format "r,c"
	
	
	public Piece (String n, int r, int c) {
		name = n;
		row = r;
		col = c;
	}
	
	
	public abstract void findPossibleMoves();
	
	public abstract void drawPicture();
	
	public ArrayList<String> getPossibleMoves(){
		return possibleMoves;
	}
	
	
}
