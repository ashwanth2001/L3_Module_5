package data_structures;

import java.util.ArrayList;

public class BandName {

	public static void main(String[] args) {
		ArrayList<String> adj = new ArrayList<String>();
		ArrayList<String> noun = new ArrayList<String>();
		noun.add("Pipes");
		noun.add("Transports");
		noun.add("Wine");
		noun.add("Brothers");
		noun.add("Approval");
		noun.add("Languages");
		noun.add("Cattles");
		noun.add("Cream");
		noun.add("Spies");
		noun.add("Captions");
		adj.add("Hallowed ");
		adj.add("Imperfect ");
		adj.add("Resonant ");
		adj.add("Acoustic ");
		adj.add("Macho ");
		adj.add("Itchy ");
		adj.add("Adaptable ");
		adj.add("Noiseless ");
		adj.add("Fretful ");
		adj.add("Animated ");
		int rand1 = (int)(Math.random()*10);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int rand2 = (int)(10*Math.random());
		System.out.println("Your band name is The " + adj.get(rand1)+noun.get(rand2) + ".");
	}
}
