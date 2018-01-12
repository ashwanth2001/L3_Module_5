package USACO;
import java.util.*;
import java.io.*;
/**
 * Write a description of class Leaderboard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Leaderboard
{
    public static void main(String[] args) throws IOException{
        ArrayList<Input> inp = new ArrayList<Input>(100);
        BufferedReader br = new BufferedReader(new FileReader("billboard.in"));
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
                s1 = 1;
            }
            else if(s.equalsIgnoreCase("elsie")){
                s1 = 2;
            }
            else if(s.equalsIgnoreCase("mildred")){
                s1 = 3;
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
        int currI = -1;
        ArrayList<Integer> out = new ArrayList<Integer>(3);
        ArrayList<Integer> maxCows1 = new ArrayList<Integer>(3);
        ArrayList<Integer> maxCows2 = new ArrayList<Integer>(3);
        int maxOut = 0;
        int maxOutI = -1;
        int amount = 0;
        
        for(int i = 0; i< inp.size(); i++){
            minD = 1000;
            minI = 1000;
            maxOut = -1;
            maxCows1 = new ArrayList<Integer>(3);
            for(int j = 0 ; j<inp.size(); j++){
                day1 = inp.get(j).day();
                if(day1<minD){
                    minD = day1;
                    minI = currI;
                }
            }
            name1 = inp.get(minI).name();
            day1 = inp.get(minI).day();
            change1 = inp.get(minI).change();
            if(name1 == 1){
                cows.get(0).add(change1);
            }
            else if(name1 == 2){
                cows.get(1).add(change1);
            }
            else if(name1 == 3){
                cows.get(2).add(change1);
            }
            out = new ArrayList<Integer>(3);
            for(int k = 0; k<3; k++){
                out.add(cows.get(k).num());
            }
            for(int x = 0; x<3; x++){
                if(out.get(x)>maxOut){
                    maxOut = out.get(x);
                    maxOutI = x;
                }
            }
            for(int y = 0; y<3; y++){
                if(out.get(y) == maxOut){
                    maxCows1.add(out.get(y));
                }
            }
            if(maxCows1 != maxCows2){
                amount++;
            }
            maxCows2 = maxCows1;
        }
        System.out.println(amount);
    }
}
