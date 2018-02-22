package codeforces;

import java.util.Scanner;

public class SampleR {

	public static void main(String[] args) 
    { 
          Scanner input=new Scanner(System.in);
          int n = input.nextInt();
          int root = (int)Math.pow(n, 0.5);
          int total = 1;
          if(n == 2||n==3) {
        	  	System.out.println("1");
          }
          else {
        	  	for(int i = 2; i <= root; i++) {
        	  		if(n%i == 0) {
        	  			total+=2;
        	  		}
        	  	}
        	  	if(n%Math.pow(n, 0.5) == 0) {
        	  		total--;
        	  	}
        	  	System.out.println(total); 
          }
          input.close(); 
     } 
}
