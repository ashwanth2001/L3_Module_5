package codeforces;

import java.util.Scanner;

public class Squares {

	public static void main(String[] args) 
    { 
		Scanner input=new Scanner(System.in);
		int n =input.nextInt();
		int max = -10000000;
		for(int i = 0; i<n; i++) {
			int n1 = input.nextInt();
			if((n1<0||Math.sqrt(n1)!=(int)Math.sqrt(n1))&&n1>max) {
				max = n1;
			}
		}
		System.out.println(max);
		input.close(); 
     } 
}
