import javax.swing.ImageIcon;
import java.util.ArrayList;

public class Bishop extends Piece {

	public Bishop (int r, int c, boolean w) {
		super('b', r, c);
		super.isWhite = w;
		super.isKing = false;
		super.picB = (new ImageIcon("Chess_bdt60.png")).getImage();
		super.picW = (new ImageIcon("Chess_blt60.png")).getImage();
	}
	
	public Bishop () {
		super('b', -1, -1);
		super.isWhite = false;
		super.isKing = false;
		super.picB = (new ImageIcon("Chess_bdt60.png")).getImage();
		super.picW = (new ImageIcon("Chess_blt60.png")).getImage();
	}
	
	public Bishop dupeThis () {
		return new Bishop();
	}
	
	
	private final int[] moveDirectionX = {1,1, -1, -1};
	private final int[] moveDirectionY = {1, -1, -1, 1};
	
	protected void findPossibleMoves(ArrayList<ArrayList<Piece>> board) {
		int x = this.col;
		int y = board.size() - this.row;
		
		if (this.isWhite) {
			
		}
		else {
			
		}
		
		
	}
	
}
