import javax.swing.ImageIcon;

public class Pawn extends Piece {

	public Pawn (int r, int c, boolean w) {
		super('p', r, c);
		super.isWhite = w;
		super.isKing = false;
		super.picB = (new ImageIcon("Chess_pdt60.png")).getImage();
		super.picW = (new ImageIcon("Chess_plt60.png")).getImage();
	}
	
	public Pawn () {
		super('p', -1, -1);
		super.isWhite = false;
		super.isKing = false;
		super.picB = (new ImageIcon("Chess_pdt60.png")).getImage();
		super.picW = (new ImageIcon("Chess_plt60.png")).getImage();
	}
	
	public void findPossibleMoves() {
		
	}
	
	public void drawPicture() {
		
	}
	
}
