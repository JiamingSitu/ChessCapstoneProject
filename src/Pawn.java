import javax.swing.ImageIcon;
import java.util.ArrayList;

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
	
	
	
	final int[] wMoveX = {0};
	final int[] wMoveY = {1};
	
	final int[] bMoveX = {0};
	final int[] bMoveY = {-1};
	
	final int[] wCaptureX = {1, -1};
	final int[] wCaptureY = {1, 1};
	
	final int[] bCaptureX = {1, -1};
	final int[] bCaptureY = {-1, -1};
	
	protected void findPossibleMoves(ArrayList<ArrayList<Piece>> board) {
		int x = this.col;
		int y = board.size() - this.row;
		
		if (this.isWhite) {
			for (int i = 0; i < wMoveX.length; i++) {
				
			}
		}
		else {
			
		}
		
		
	}
	
}
