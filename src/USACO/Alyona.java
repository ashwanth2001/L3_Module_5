package USACO;

import java.io.*;
import java.util.*;

public class Alyona {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    long n1a =(long)Integer.parseInt(st.nextToken());
	    long n2a =(long)Integer.parseInt(st.nextToken());
	    long n1 = Math.min(n1a, n2a);
	    long n2 = Math.max(n1a, n2a);
		long ans = 0;
		for(int i = 5; i<=n1+n2; i+=5) {
			ans+=Math.abs(Math.min(i-1, n2)-(i-Math.min(i-1, n1))+1);
		}
		System.out.println(ans);	
	}
}
