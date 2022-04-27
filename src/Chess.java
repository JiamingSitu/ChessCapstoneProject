import java.util.ArrayList;
import java.util.TreeMap;

public class Chess {

	public static int rowNum = 8;
	public static int colNum = 8;
	
	public final static int PAWN = 0;
	public final static int KNIGHT = 1;
	public final static int BISHOP = 2;
	public final static int ROOK = 3;
	public final static int QUEEEN = 4;
	public final static int KING = 5;
	
	private static char[] availablePieces = {'p', 'b', 'n', 'r', 'q', 'k'};
	private static boolean[] fillRow = {true, true, false, false, false, false, true, true};
	
	
	
	public static ArrayList<ArrayList<Character>> generateBoard(){
		ArrayList<ArrayList<Character>> boardSetup = new ArrayList<ArrayList<Character>>();
		int kingCounter = 0;
		
		for (int i = 0; i < rowNum; i++) {
			ArrayList<Character> temp = new ArrayList<Character>();
			
			for (int j = 0; j < colNum; j++) {
				
				if (!fillRow[i]) {
					temp.add(' ');
					continue;
				}
				
				int pieceIndex = (int)(6 * Math.random());
				
				while (kingCounter >= 2 && pieceIndex == KING)
					pieceIndex = (int)(6 * Math.random());
				
				
				
				temp.add(availablePieces[pieceIndex]);
				
				if (pieceIndex == KING) kingCounter++;
			}
			
			boardSetup.add(temp);
		}
		return boardSetup;
	}
	
	public static void main (String[] args) {
		
		Chessboard CB = new Chessboard(rowNum, colNum); // width, height
		CB.drawBoard();
		
		CB.board = generateBoard();
		
		System.out.println(CB.board.toString());
		

		
		
		
		
	}
}
