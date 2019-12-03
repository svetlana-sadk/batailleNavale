package batailleNavale;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class HidingBoard {
	ArrayList<Ship> ships = new ArrayList<Ship>();
	private Map<String, Integer> board; //creation of the hashmap is described in the constructor 
	
	public HidingBoard() {
		this.board = new HashMap<>(); //
		String str = "";
		int lenght = 10;
		
		for(int i=1; i<=lenght; i++) {
			str = "A" + i;
			board.put(str, 0);
			str = "B" + i;
			board.put(str, 0);
			str = "C" + i;
			board.put(str, 0);
			str = "D" + i;
			board.put(str, 0);
			str = "E" + i;
			board.put(str, 0);
			str = "F" + i;
			board.put(str, 0);
			str = "G" + i;
			board.put(str, 0);
			str = "H" + i;
			board.put(str, 0);
			str = "I" + i;
			board.put(str, 0);
			str = "J" + i;
			board.put(str, 0);
		}
		
		System.out.println(board);
	}
	
	public void putShip(Ship ship) {
		
	}
	
	public void shotAt(String string) {
		throw new UnsupportedOperationException();
	}
		
	public void squareStatus(String string) {
		throw new UnsupportedOperationException();
	}
}
