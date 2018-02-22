package codeforces;

import java.util.Scanner;

public class counterexample {

	
	public static void main(String[] args) 
    { 
		Scanner input=new Scanner(System.in);
		long l =input.nextLong(); 
		long r =input.nextLong();
		if(r-l == 2&&r%2 == 0) {
			System.out.println(l + " " + (l+1) + " " + r);
		}
		else if(r-l>2) {
			if(l%2 == 0) {
				System.out.println(l + " " + (l+1) + " " + (l+2));
				}
			else {
				System.out.println((l+1) + " " + (l+2) + " " + (l+3));
			}
		}
		else {
			System.out.println(-1);
		}
		input.close(); 
     } 
}
