import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chessboard extends JPanel{
	public final int WINDOW_SIZE = 600;
	public int boardWidth, boardHeight; // in tiles
	private int gridSize; 				// in pixels
	
	public ArrayList<ArrayList<Piece>> board;
	
	public Chessboard(int bW, int bH) {
		boardWidth = bW;
		boardHeight = bH;
		gridSize = WINDOW_SIZE / (Math.max(bW, bH) + 1);
	}
	
	public Piece toPiece(char c) {
		if (c == 'p') {
			return new Pawn();
		}
//		else if (c == 'b') {
//			return new Bishop();
//		}
		
		
		
		
		
		
		
		else return new Pawn(); // placeholder
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// System.out.println(gridSize);
		
		int topOffset, leftOffset;
		topOffset = (WINDOW_SIZE - gridSize * boardHeight) / 2;
		leftOffset = (WINDOW_SIZE - gridSize * boardWidth) / 2;
		
		for (int i = 0; i < boardHeight; i++) 
			for (int j = 0; j < boardWidth; j++) 
				g.drawRect(j * gridSize + leftOffset, i * gridSize + topOffset, gridSize, gridSize);
			
		for (int i = 0; i < boardHeight; i++) {
			for (int j = 0; j < boardWidth; j++) {
				int xCoord = j * gridSize + leftOffset;
				int yCoord = i * gridSize + topOffset;
				
				boolean isOnWhite = true;
				if (i <= boardHeight / 2) isOnWhite = false;
				
				Piece curPiece = board.get(i).get(j);
				if (curPiece.name == 'E') continue;
				
				curPiece.isWhite = isOnWhite;
				curPiece.row = i;
				curPiece.col = j;
				curPiece.drawPicture(xCoord, yCoord, curPiece.isWhite, g);

				
				
			}
		}
		
		
	}
	
	public void drawBoard() {
		
		JFrame window = new JFrame("Chessboard");
		window.setBounds(100, 100, WINDOW_SIZE, WINDOW_SIZE);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.WHITE);
		window.getContentPane().add(this);
		window.setResizable(false);
		window.setVisible(true);
		
	}
	
	
	
	
}
