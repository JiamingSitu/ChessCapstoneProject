import java.util.ArrayList;
import java.awt.event.*; 
import javax.swing.JFrame;
import java.awt.Point;

public class Chess {

	private static final int rowNum = 8;
	private static final int colNum = 8;
	private static final boolean standardKingPos = true;
	
	private static final Piece[] availablePieces = {new Pawn(), new Bishop()/*, new Knight(), new Rook(), new Queen()*/, new King()}; // make sure king is the back-most piece
	
	private static final boolean[] fillRow = {true, true, false, false, false, false, true, true};
	
	
	
	public static ArrayList<ArrayList<Piece>> generateBoard(){
		ArrayList<ArrayList<Piece>> boardSetup = new ArrayList<ArrayList<Piece>>();
		
		for (int i = 0; i < rowNum; i++) {
			ArrayList<Piece> temp = new ArrayList<Piece>();
			for (int j = 0; j < colNum; j++) {
				
				if (!fillRow[i]) {
					temp.add(new Empty());
					continue;
				}
				
				// this excludes last piece from being rolled (the king)
				int pieceIndex = (int)((availablePieces.length - 1) * Math.random());
					
				Piece nextPiece;
				
				if (standardKingPos && j == 4 && (i == 0 || i == rowNum - 1)) 
					nextPiece = availablePieces[availablePieces.length - 1].dupeThis(); // is a king
				else
					nextPiece = availablePieces[pieceIndex].dupeThis();

				
				temp.add(nextPiece);
			}
			boardSetup.add(temp);
		}
		return boardSetup;
	}
	
	private static Point selectedGrid = new Point(-1, -1);
	

	
	public static void main (String[] args) {
		
		Chessboard CB = new Chessboard(rowNum, colNum); // width, height
		JFrame window = new JFrame("Chessboard");
		window.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed (MouseEvent e) {
				selectedGrid = CB.clickedGridIndex(e.getX(), e.getY());
				if (selectedGrid.x != -1 && selectedGrid.y != -1) {
					System.out.println(e.getX() + " " + e.getY());
					System.out.println(selectedGrid.toString());
					System.out.println(CB.board.get(selectedGrid.y).get(selectedGrid.x).name + "\n");
				}
				
				// resetting
				selectedGrid.x = -1;
				selectedGrid.y = -1;
			}
		});

		CB.drawBoard(window);

		
		CB.board = generateBoard();
		
		System.out.println(CB.board.toString());
		
		
		
	}
}
