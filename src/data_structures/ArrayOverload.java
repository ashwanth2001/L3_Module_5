package data_structures;

import java.util.ArrayList;

public class ArrayOverload {
	public static void main(String[] args) {
		Thread[] threads = new Thread[1000001];
		ArrayList<Integer> list = new ArrayList<Integer>();
		threads[0] = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 1000000; i>0; i--) {
					int j = i;
					threads[i] = new Thread(new Runnable() {

						@Override
						public void run() {
							// TODO Auto-generated method stub
							list.add(1);
						}
						
					});
					threads[i].start();
				}
			}
		});
		threads[0].start();
		System.out.print(list);
	}
}
