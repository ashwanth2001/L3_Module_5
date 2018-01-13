
import java.io.*;
import java.util.*;

public class BovineShuffle {

	 public static void main(String[] args) throws IOException{
		 BufferedReader br = new BufferedReader(new FileReader("shuffle.in"));
	     PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));
	       
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int numCows = Integer.parseInt(st.nextToken());
	       
	    st = new StringTokenizer(br.readLine());
	    ArrayList<Integer> fin = new ArrayList<Integer>(numCows);
	        
	    for(int i = 0; i<numCows; i++) {
	    		fin.add(Integer.parseInt(st.nextToken()));
	    }
	        
	    st = new StringTokenizer(br.readLine());
	    ArrayList<String> id = new ArrayList<String>(numCows);
	        
	    for(int i = 0; i<numCows; i++) {
	    		id.add(st.nextToken());
	    }
	    
	    int savej = -1;
	    ArrayList<String> sol = new ArrayList<String>(numCows);
	    for(int i = 1; i<numCows+1; i++) {
	     	for(int j = 0; j<numCows; j++) {
	     		if(fin.get(j) == i) {
	     			savej = j;
	     			break;
	     		}
	     	}
	        	sol.add(id.get(savej));
	    }
	    for(int k = 0; k<numCows; k++) {
	        pw.println(sol.get(k));
	    }
	}
}
