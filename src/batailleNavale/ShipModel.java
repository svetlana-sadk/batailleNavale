package batailleNavale;

public enum ShipModel {

	CANOE(1), SUBMARINE(2), CRUISER(3), LINER(4);
	
	private final int size;
	
	ShipModel(int sizeOfShip){
		this.size = sizeOfShip;
	}
	
	public int getSize(){
		return this.size;
	}
	

}
