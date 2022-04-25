import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chess extends JPanel {

	Chessboard CB;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int w = getHeight();
		int h = getWidth();
		
		
		
		
	}
	
	public static void main (String[] args) {
		
	//CB = new ChessBoard(1, 2, 3, 4)
		
		
		
		
		
		JFrame window = new JFrame("Chessboard");
		window.setBounds(100, 100, 600, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel canvas = new Chess();
		canvas.setBackground(Color.WHITE);
		window.getContentPane().add(canvas);
		window.setVisible(true);
		
	}
}
