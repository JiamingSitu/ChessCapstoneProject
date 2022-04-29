import java.util.ArrayList;

public class BoardState {
	
	ArrayList<ArrayList<Piece>> board;
	
	public BoardState (ArrayList<ArrayList<Piece>> B) {
		this.board = B;
	}
	
	// 1 if white is checked, -1 if black is checked, 0 if no checks
	public int hasCheck () {
		int output = 0;
		
		int wKingRow, wKingCol;
		int bKingRow, bKingCol;
		
		
		for (int i = 0; i < board.size(); i++) {
			for (int j = 0; j < board.get(i).size(); j++) {
				if (board.get(i).get(j).name == 'k') {
					if (board.get(i).get(j).isWhite) {
						wKingRow = i; wKingCol = j;
					}
					else {
						bKingRow = i; bKingCol = j;
					}
				}
			}
		}
		return output;
	}
}
