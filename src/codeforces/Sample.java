package codeforces;

import java.util.*;

public class Sample {
	
    public static void main(String[] args) 
    { 
          Scanner input=new Scanner(System.in);
          int n =input.nextInt();
          String s = input.next();
          
          for(int i = 0; i<n-1; i++) {
        	  	char c1 = s.charAt(i);
        	  	char c2 = s.charAt(i+1);
        	  	if((c1 == 'a'||c1 == 'e'||c1 == 'i'||c1 == 'o'||c1 == 'u'||c1 == 'y')&&(c2 == 'a'||c2 == 'e'||c2 == 'i'||c2 == 'o'||c2 == 'u'||c2 == 'y')) {
        	  		s = s.substring(0, i+1) + s.substring(i+2);
        	  		i--;
        	  		n--;
        	  	}
          }
          System.out.println(s); 
          input.close(); 
     } 
    
}
