package codeforces;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Fahim on 4/9/2017.
 */
public class JC707C {
	
    static void Do(){
        Scanner sc = new Scanner(System.in);
        try {
            long n = sc.nextLong();
            if (n < 3) System.out.println(-1);
            else if (n % 2 == 0) System.out.println((n * n / 4 - 1) + " " + (n * n / 4 + 1));
            else System.out.println((n * n) / 2 + " " + ((n * n) / 2 + 1)); /* not n^2-1 cz the code discards the fraction part!*/
        }catch (InputMismatchException x){ System.out.println("InputMismatchException x :"+ x.toString());}
        sc.close();
    }
    public static void main(String[] Args) throws Exception{ 
    		Do();
    	}
}
