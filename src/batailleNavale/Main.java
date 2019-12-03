package batailleNavale;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HidingBoard hidingBoard = new HidingBoard();
		// every time we create or shot any boat we need to change the state of the board
		
		Ship ship4 = new Ship(ShipModel.LINER,Direction.RIGHT, "A1");
		hidingBoard.putShip(ship4);
		Ship ship3 = new Ship(ShipModel.CRUISER,Direction.DOWN, "C5");
		Ship ship3_2 = new Ship(ShipModel.CRUISER,Direction.UP, "H8");
		Ship ship2 = new Ship(ShipModel.SUBMARINE,Direction.LEFT, "B10");
		Ship ship2_2 = new Ship(ShipModel.SUBMARINE,Direction.RIGHT, "D2");
		Ship ship2_3 = new Ship(ShipModel.SUBMARINE,Direction.DOWN, "G2");
		Ship ship1 = new Ship(ShipModel.CANOE,Direction.LEFT, "I4");
		Ship ship1_2 = new Ship(ShipModel.CANOE,Direction.LEFT, "D9");
		Ship ship1_3 = new Ship(ShipModel.CANOE,Direction.LEFT, "I10");
		Ship ship1_4 = new Ship(ShipModel.CANOE,Direction.LEFT, "J1");
	}

}
