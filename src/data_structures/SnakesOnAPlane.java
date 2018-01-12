package data_structures;

import java.util.ArrayList;

public class SnakesOnAPlane {
	
	public static void main(String[] args) {
		ArrayList<Snakes> snakes = new ArrayList<Snakes>();
		int a1 = 0;
		int a2 = 0;
		boolean a3 = false;
		for(int i = 0; i<100; i++) {
			a1 = (int)(Math.random()*10)+1;
			a2 = (int)(Math.random()*2);
			if(a2==0) {
				a3 = false;
			}
			else {
				a3 = true;
			}
			snakes.add(new Snakes(a1,a3));
			//System.out.println(a1);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int sum = 0;
		for(int i = 0; i<100;i++) {
			if(snakes.get(i).getVen() == true) {
				sum+=snakes.get(i).getVis();
			}
		}
		sum*=10;
		double s = (double)sum/10000;
		System.out.println(s);
	}
}
