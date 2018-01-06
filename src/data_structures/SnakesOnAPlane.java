package data_structures;

public class SnakesOnAPlane {
	
	public static void main(String[] args) {
		int a1 = rand10();
		boolean b1 = randb();
	}
	
	static int rand10() {
		int rand = (int)(Math.random()*10)+1;
		return rand;
	}
	
	static boolean randb() {
		int rand = (int)(Math.random()*2);
		if(rand==1) {
			return true;
		}
		return false;
	}
}
