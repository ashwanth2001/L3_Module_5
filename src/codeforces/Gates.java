package codeforces;

import java.util.Scanner;

public class Gates {

	public static void main(String[] args) 
    { 
          Scanner input=new Scanner(System.in);
          int n =input.nextInt();
          String s = input.next();
          
          int k = 0;
          char c = s.charAt(0);
         
          if(c == 'U') {
    		  	k--;
          }
          else {
    	  		k++;
          }
         
          int pos = k;
          int cross = 0;
          
          for(int i = 1; i<n; i++) {
        	  	c = s.charAt(i);
        	  	if(c == 'U') {
        	  		pos--;
        	  	}
        	  	else {
        	  		pos++;
        	  	}
        	  	
        	  	if(k>0&&pos<0) {
        		  cross++;
        		  k=-1;
        	  	}
        	  	
        	  	if(k<0&&pos>0) {
          		  cross++;
          		  k=1;
          	}
          }
          System.out.println(cross);
          input.close(); 
     } 
    
}
