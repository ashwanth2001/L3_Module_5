package USACO;
import java.util.*;
import java.io.*;

public class Leaderboard
{
    public static void main(String[] args) throws IOException{
        ArrayList<Input> inp = new ArrayList<Input>(100);
        BufferedReader br = new BufferedReader(new FileReader("src/USACO/test1.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
        // read in the locations of the first billboard
        StringTokenizer st = new StringTokenizer(br.readLine());
        int times = Integer.parseInt(st.nextToken());
        String s;
        int day;
        int diff;
        String diff1;
        int s1 = 0;
        
        for(int i = 0; i<times; i++) {
            st = new StringTokenizer(br.readLine());
            day = Integer.parseInt(st.nextToken());
            s = st.nextToken();
            if(s.equalsIgnoreCase("bessie")){
                s1 = 0;
            }
            else if(s.equalsIgnoreCase("elsie")){
                s1 = 1;
            }
            else if(s.equalsIgnoreCase("mildred")){
                s1 = 2;
            }
            diff1 = st.nextToken();
            if(diff1.charAt(0) == '-') {
                diff = -1*Integer.parseInt(diff1.substring(1));
            }
            else {
                diff = Integer.parseInt(diff1.substring(1));
            }
            inp.add(new Input(day,s1,diff));
        }
        
        ArrayList<Cow> cows = new ArrayList<Cow>(3);
        cows.add(new Cow(1,7));
        cows.add(new Cow(2,7));
        cows.add(new Cow(3,7));
        
        int name1 = 0;
        int change1 = 0;
        int day1 = 1000;
        int minD = 1000;
        int minI = 1000;
        ArrayList<Integer> out = new ArrayList<Integer>(3);
        ArrayList<Integer> maxCows1 = new ArrayList<Integer>(3);
        ArrayList<Integer> maxCows2 = new ArrayList<Integer>(3);
        int maxOut = 0;
        int amount = 0;
        int constant = inp.size();
        
        for(int i = 0; i< constant; i++){
            minD = 1000;
            minI = 1000;
            maxOut = -1;
            maxCows1 = new ArrayList<Integer>(3);
            for(int j = 0 ; j<inp.size(); j++){
                day1 = inp.get(j).day();
                if(day1<minD){
                    minD = day1;
                    minI = j;
                }
            }
            name1 = inp.get(minI).name();
            day1 = inp.get(minI).day();
            change1 = inp.get(minI).change();
            if(name1 == 0){
                cows.get(0).add(change1);
            }
            else if(name1 == 1){
                cows.get(1).add(change1);
            }
            else if(name1 == 2){
                cows.get(2).add(change1);
            }
            out = new ArrayList<Integer>(3);
            for(int k = 0; k<3; k++){
                out.add(cows.get(k).output());
            }
            for(int x = 0; x<3; x++){
                if(out.get(x)>maxOut){
                    maxOut = out.get(x);
                }
            }
            for(int y = 0; y<3; y++){
                if(out.get(y) == maxOut){
                    maxCows1.add(y);
                }
            }
            if(!Check(maxCows1, maxCows2)){
                System.out.print(maxCows1);
            		amount++;
            }
            maxCows2 = maxCows1;
            inp.remove(minI);
        }
        pw.println(amount);
		pw.close();
    }
    
    public static boolean Check(ArrayList<Integer> maxCows1, ArrayList<Integer> maxCows2)
    {
        //null checking
        if(maxCows1==null && maxCows2==null)
            return true;
        if((maxCows1 == null && maxCows2 != null) || (maxCows1 != null && maxCows2 == null))
            return false;

        if(maxCows1.size()!=maxCows2.size())
            return false;
        for(Object itemList1: maxCows1)
        {
            if(!maxCows2.contains(itemList1))
                return false;
        }

        return true;
    }
}

class Input {
	int day;
    int name;
    int change;
    public Input(int day1, int name1, int change1){
        change = change1;
        name = name1;
        day = day1;
    } 
    
    public int day(){
        return day;
    }
    
    public int change(){
        return change;
    }
    
    public int name(){
        return name;
    }
}

class Cow {
	int output;
    int name;
    public Cow(int name1, int output1){
        name = name1;
        output = output1;
    }
    
    public void add(int input){
        output+=input;
    }
    
    public int name(){
        return name;
    }
    
    public int output(){
        return output;
    }
}