import java.util.ArrayList;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;


public abstract class Piece {
	
	String name;
	
	public static final int PIXELS_PER_INCH = 10;
	
	protected int row;
	protected int col;
	
	protected int value;
	
	protected boolean isWhite;
	protected boolean isKing;
	
	protected Image picB, picW;
	
	ArrayList<String> possibleMoves; // format "r,c"
	
	
	public Piece (String n, int r, int c) {
		name = n;
		row = r;
		col = c;
	}
	
	
	protected abstract void findPossibleMoves();
	
	public void drawPicture(int x, int y, Graphics g) {
		
	}
	
	public ArrayList<String> getPossibleMoves(){
		return possibleMoves;
	}
	
	
}
