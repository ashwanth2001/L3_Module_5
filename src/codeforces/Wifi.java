package codeforces;

import java.util.Scanner;

public class Wifi {
	
	public static void main(String[] args)
	{ 
		Scanner input=new Scanner(System.in);
		int R =input.nextInt();
		int x1 = input.nextInt();
	    int y1 = input.nextInt();
	    int x2 = input.nextInt();
	    int y2 = input.nextInt();
	    double d = Math.pow(Math.pow(y2-y1, 2)+Math.pow(x2-x1, 2), 0.5);
	    
	    if(d>R) {
	    		System.out.println(x1 + " " + y1 + " " + R);
	    }
	    
	    else if (d==0){
	    		double yret = y1+(double)R/2;
	    		double R1 = (double)R/2;
	    		System.out.println(x1 + " " + yret + " " + R1);
	    }
	    
	    else {	
	    		double xr = (x1-x2)/d*R+x1;
	    		double yr = (y1-y2)/d*R+y1;
	    		double xm = (x2+xr)/2;
	    		double ym = (y2+yr)/2;
	    		double rf = (d+R)/2;
	    		System.out.println(xm + " " + ym + " " + rf);
	    }
	    input.close();
    } 
}
