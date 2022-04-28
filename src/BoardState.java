import java.util.ArrayList;

public class BoardState {
	
	ArrayList<ArrayList<Character>> board;
	
	public BoardState (ArrayList<ArrayList<Character>> B) {
		this.board = B;
	}
	
	// 1 if white is checked, -1 if black is checked, 0 if no checks
	public int hasCheck () {
		for (int i = 0; i < board.size(); i++) {
			for (int j = 0; j < board.get(i).size(); j++) {
				
			}
		}
		
		
	}
	
	
}
