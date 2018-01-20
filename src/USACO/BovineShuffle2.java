//package USACO;
import java.io.*;
import java.util.*;

public class BovineShuffle2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("shuffle.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] alg = new int[n];
		
		for(int i = 0; i<n; i++) {
			alg[i] = (Integer.parseInt(st.nextToken())-1);
		}
		
		int[] save = new int[n];
		int[] save2 = new int[n];
		
		for(int y = 0; y<n; y++) {
			save[y]++;
		}
		for(int j = 0; j<n; j++) {
			for( int k = 0; k<n; k++) {
				save2[alg[k]]+=save[k];
			}
			save = save2;
		}
		
		int fin = 0;
		
		for(int l = 0; l<n; l++) {
			if(save2[l]>=n) {
				fin++;
			}
		}
		pw.println(fin);
		pw.close();
	}
}
