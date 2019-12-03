package batailleNavale;

public class Ship {
	ShipModel shipModel;
	Direction direction;
	String str;
	
	
	public Ship(ShipModel shipModel,Direction direction,String str){
		this.shipModel = shipModel;
		this.direction = direction;
		this.str = str;
	}
	
	public boolean isOnSquare() {
		throw new UnsupportedOperationException();
	}
	
	public boolean isSunk() {
		throw new UnsupportedOperationException();
	}

}	
	
	
	

