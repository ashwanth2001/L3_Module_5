package USACO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CounterExample {
	
	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    long n1 =Long.parseLong(st.nextToken());
	    long n2 =Long.parseLong(st.nextToken());
		if(n1%2==1) 
			n1++;
		if(n2-n1>=2) 
			System.out.println(n1 + ", " + (n1+1) + ", " + (n1+2));
		else System.out.println("-1");
	}
}