import java.util.ArrayList;
import java.awt.Image;
import java.awt.Graphics;	



public abstract class Piece {
	
	char name;
	
	public static final int PIXELS_PER_INCH = 10;
	
	protected int row;
	protected int col;
	
	protected int value;
	
	protected boolean isWhite;
	protected boolean isKing;
	
	protected Image picW, picB;
	
	
	
	ArrayList<String> possibleMoves; // format "r,c"
	
	
	public Piece (char n, int r, int c) {
		name = n;
		row = r;
		col = c;
	}
	
	
	public abstract Piece dupeThis();
	
	protected abstract void findPossibleMoves(ArrayList<ArrayList<Piece>> board);
	
	public void drawPicture(int x, int y, boolean isWhite, Graphics g) {
		if (isWhite) g.drawImage(picW, x, y, null);	
		else		 g.drawImage(picB, x, y, null);
	}
	
	public ArrayList<String> getPossibleMoves(){
		return possibleMoves;
	}
	
	
}
