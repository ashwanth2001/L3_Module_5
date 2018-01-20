package USACO;

import javax.swing.JOptionPane;

public class Museum {
	public static void main(String[] args) {
		String s = "a" + JOptionPane.showInputDialog("Type in a word.");
		int ans = 0;
		for(int i = 0; i<s.length()-1; i++) {
			int diff = Math.abs(s.charAt(i) - s.charAt(i+1));
			if(diff>13)
				diff=Math.abs(diff-26);
			ans += diff;
		}
		System.out.println(ans);
	}
}