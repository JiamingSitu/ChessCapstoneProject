import java.util.ArrayList;
import java.awt.event.*; 
import javax.swing.*;	
import javax.swing.JFrame;

public class Chess {

	public static int rowNum = 8;
	public static int colNum = 8;
	
	private static final boolean standardKingPos = true;
	
	public final static int PAWN = 0;
	public final static int KNIGHT = 1;
	public final static int BISHOP = 2;
	public final static int ROOK = 3;
	public final static int QUEEEN = 4;
	public final static int KING = 5;
	
	private static Piece[] availablePieces = {new Pawn(), new Bishop()/*, new Knight(), new Rook(), new Queen()*/, new King()};
	private static boolean[] fillRow = {true, true, false, false, false, false, true, true};
	
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
	
	
	private static boolean isLegal(ArrayList<ArrayList<Piece>> B) {
		boolean wKingExists = false;
		boolean bKingExists = false;
		
		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < colNum; j++) {
				Piece curPiece = B.get(i).get(j);
				
				if (curPiece.isKing) {
					if (curPiece.isWhite) wKingExists = true;
					if(!curPiece.isWhite) bKingExists = true;
				}
				
			}
		}
		return wKingExists && bKingExists;
	}
	
	public static void main (String[] args) {
		
		Chessboard CB = new Chessboard(rowNum, colNum); // width, height
		
		
		JFrame window = new JFrame("Chessboard");
		JPanel panel = new JPanel();

		CB.drawBoard(window, panel);

		
		CB.board = generateBoard();
		
		System.out.println(CB.board.toString());
	}
}
