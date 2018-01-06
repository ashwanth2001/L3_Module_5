package data_structures;

import java.util.ArrayList;

public class RandomDinner {
	
	public static void main(String[] args) {
		ArrayList<String> dinner = new ArrayList<String>();
		dinner.add("Meatloaf");
		dinner.add("Honey Baked Chicken");
		dinner.add("Salisbury steaks");
		dinner.add("Beef Stroganoff");
		dinner.add("Tacos");
		dinner.add("Taco Salad");
		dinner.add("Chicken Fajitas");
		dinner.add("Cheeseburger");
		dinner.add("Pizza");
		dinner.add("Burrito");
		int random = (int)(Math.random()*10);
		String s = dinner.get(random);
		System.out.println("You should eat " + s + " tonight");
	}
}
