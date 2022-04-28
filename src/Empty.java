import javax.swing.ImageIcon;

public class Empty extends Piece {

	public Empty (int r, int c, boolean w) {
		super('E', r, c);
		super.picB = null;
		super.picW = null;
	}
	
	public Empty () {
		super('E', -1, -1);
		super.picB = null;
		super.picW = null;
	}
	
	public void findPossibleMoves(){
		
	}
	
	public void drawPicture() {
		
	}
	
}
