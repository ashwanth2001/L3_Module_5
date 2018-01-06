package algorithms;

import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("How many numbers of the Fibonacci Sequence would you like?");
		int a = Integer.parseInt(s);
		int x = 0;
		int y = 1; 
		int z = 0;
		for(int i = 0; i<a; i++) {
			System.out.print(x+", ");
			z = y;
			y = x+y;
			x = z;
		}
	}
}
//https://league-level3.github.io/mod4quiz