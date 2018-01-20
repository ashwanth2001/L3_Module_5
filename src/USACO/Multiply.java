package USACO;
import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class Multiply {
	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("Type in the first multiple.");
		String s2 = JOptionPane.showInputDialog("Type in the second multiple.");
		int len1 = s1.length();
		int len2 = s2.length();
		ArrayList<Integer> num1 = new ArrayList<Integer>(len1);
		ArrayList<Integer> num2 = new ArrayList<Integer>(len2);
		
		for(int i = 0; i<len1; i++) {
			num1.add(Integer.parseInt(s1.substring(i, i+1)));
		}
		for(int i = 0; i<len2; i++) {
			num2.add(Integer.parseInt(s2.substring(i, i+1)));
		}
		
		int max = len1+len2-1;
		int[] ans = new int[max+1];
		
		for(int i = 0; i<len1; i++) {
			for(int j = 0; j<len2; j++) {
				ans[i+j] += num1.get(i)*num2.get(j);
			}
		}
		
		int l = 0;
		int div = 0;
		
		for(int x = max-1; x>0; x--) {
			l = Integer.toString(ans[x]).length();
			if(l>1) {
				div = ans[x]/10;
				ans[x-1]+=ans[x]/10;
				ans[x] = ans[x]%10;	
			}
		}
		
		System.out.print(s1 + " * " + s2 + " = ");
		for(int k = 0; k<max; k++) {
			System.out.print(ans[k]);
		}
	}
}
