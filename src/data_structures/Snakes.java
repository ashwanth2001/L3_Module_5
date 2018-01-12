package data_structures;

public class Snakes {
	int vis;
	boolean ven;
	public Snakes(int visciousness, boolean venomous) {
		vis = visciousness;
		ven = venomous;
	}
	
	public int getVis() {
		return vis;
	}
	
	public boolean getVen() {
		return ven;
	}
	
}
