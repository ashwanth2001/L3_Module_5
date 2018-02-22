package codeforces;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) 
    { 
		Scanner input=new Scanner(System.in);
		int n =input.nextInt();
		int num = n/2;
		
		if(n>36)
			System.out.println(-1);
		else {
			for(int i = 0; i<num; i++) {
				System.out.print(8);
			}
			if(n%2==1)
				System.out.println(9);
		}
		
		input.close(); 
     } 
}
