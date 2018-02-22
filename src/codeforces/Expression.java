package codeforces;

import java.util.Scanner;

public class Expression {

	public static void main(String[] args) 
    { 
          Scanner input=new Scanner(System.in);
          int n1 = input.nextInt();
          int n2 = input.nextInt();
          int n3 = input.nextInt();
          int[] sol = new int[6];
          
          sol[0] = n1+n2+n3;
          sol[1] = n1*n2*n3;
          sol[2] = n1*(n2+n3);
          sol[3] = (n1+n2)*n3;
          sol[4] = n1*n2+n3;
          sol[5] = n2*n3+n1;
          
          int max = 0;
          for(int i = 0; i<6; i++) {
        	  	if(sol[i]>max) {
        	  		max = sol[i];
        	  	}
          }
          
          System.out.println(max);
          input.close(); 
     }
}
