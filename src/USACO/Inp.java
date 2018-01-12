package USACO;

public class Inp {
	String name1;
	int change1;
	int day1;
	
	public Inp(int day, String name, int change) {
		name1 = name;
		change1 = change;
		day1 = day;
	}
	
	public int retC() {
		return change1;
	}
	
	public String retN() {
		return name1;
	}
	
	public int retD() {
		return day1;
	}
	
}
