package USACO;
import java.io.*;
import java.util.*;

public class BovineShuffle {

	 public static void main(String[] args) throws IOException{
		 BufferedReader br = new BufferedReader(new FileReader("shuffle.in"));
	     PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));
	       
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int numCows = Integer.parseInt(st.nextToken());
	       
	    st = new StringTokenizer(br.readLine());
	    int[] fin = new int[numCows];
	    for(int i = 0; i<numCows; i++) {
	    		fin[i]+=(Integer.parseInt(st.nextToken())-1);
	    }
	        
	    st = new StringTokenizer(br.readLine());
	    String[] id = new String[numCows];
	    for(int i = 0; i<numCows; i++) {
	    		id[i] = st.nextToken();
	    }
	    
	    String[] id2 = new String[numCows];
	    for(int z = 0; z<3; z++) {
	    		for(int i = 0; i<numCows; i++) {
	    			for(int j = 0; j<numCows; j++) {
	    				if(fin[j] == i) {
	    					id2[j] = id[i];
	    					break;
	    				}
	    			}
	    		}
	    		id = id2;
	    		id2 = new String[numCows];
	    }
	    
	    for(int k = 0; k<numCows; k++) {
	    		pw.println(id[k]);
	    }
	    pw.close(); 
	 }
}
