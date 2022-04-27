import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chessboard extends JPanel{
	public final int WINDOW_SIZE = 500;
	public int boardWidth, boardHeight; // in tiles
	private int gridSize; 				// in pixels
	
	
	public Chessboard(int bW, int bH) {
		boardWidth = bW;
		boardHeight = bH;
		gridSize = WINDOW_SIZE / (Math.max(bW, bH) + 1);
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
