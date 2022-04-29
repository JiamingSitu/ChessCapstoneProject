import javax.swing.ImageIcon;
import java.util.ArrayList;

public class King extends Piece {

	public King (int r, int c, boolean w) {
		super('k', r, c);
		super.isWhite = w;
		super.isKing = true;
		super.picB = (new ImageIcon("Chess_kdt60.png")).getImage();
		super.picW = (new ImageIcon("Chess_klt60.png")).getImage();
	}
	
	public King () {
		super('k', -1, -1);
		super.isWhite = false;
		super.isKing = true;
		super.picB = (new ImageIcon("Chess_kdt60.png")).getImage();
		super.picW = (new ImageIcon("Chess_klt60.png")).getImage();
	}
	
	public King dupeThis () {
		return new King();
	}
	
	
	private final int[] moveDirectionX = {0, 1, 1, 1, 0, -1, -1, -1};
	private final int[] moveDirectionY = {1, 1, 0, -1, -1, -1, 0, 1};
	
	protected void findPossibleMoves(ArrayList<ArrayList<Piece>> board) {
		int x = this.col;
		int y = board.size() - this.row;
		
		if (this.isWhite) {
			
		}
		else {
			
		}
		
		
	}
	
}
