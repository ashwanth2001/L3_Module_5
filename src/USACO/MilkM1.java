package USACO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MilkM1 {
	
	public static void main(String[] args) throws IOException {
		// initialize file I/O
		BufferedReader br = new BufferedReader(new FileReader("src/USACO/test1.txt"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
		ArrayList<Inp> inp = new ArrayList<Inp>(100);
		// read in the locations of the first billboard
		StringTokenizer st = new StringTokenizer(br.readLine());
		int times = Integer.parseInt(st.nextToken());
		String s;
		int day;
		int diff;
		String diff1;
		for(int i = 0; i<times; i++) {
			st = new StringTokenizer(br.readLine());
			day = Integer.parseInt(st.nextToken());
			s = st.nextToken();
			diff1 = st.nextToken();
			if(diff1.charAt(0) == '-') {
				diff = -1*Integer.parseInt(diff1.substring(1));
			}
			else {
				diff = Integer.parseInt(diff1.substring(1));
			}
			inp.add(new Inp(day, s,diff));
		}
		String top = "";
		String curr = "";
		int bess = 7;
		int els = 7;
		int mil = 7;
		int lowd = 1000;
		int lowj = 1000;
		int currd;
		int max = 7;
		int rep = 0;
		int size = 0;
		for(int i = 0; i<times; i++) {
			lowd = 1000;
			lowj = 1000;
			size = inp.size();
			for(int j = 0; j<size; j++) {
				currd = inp.get(j).retD();
				if(currd<lowd) {
					lowd = currd;
					lowj = j;
				}
			}
			curr = inp.get(lowj).retN();
			if(curr.equalsIgnoreCase("Bessie")) {
			bess+=inp.get(lowj).retC();
			}
			else if(curr.equalsIgnoreCase("Mildred")) {
			mil+=inp.get(lowj).retC();
			}
			else if(curr.equalsIgnoreCase("Elsie")) {
			els+=inp.get(lowj).retC();
			}
			if(bess>max && !top.equals("Bessie")) {
				max = bess;
				top = "Bessie";
				rep++;
				System.out.println(top);
			}
			if(mil>max && !top.equals("Mildred")) {
				max = bess;
				top = "Mildred";
				rep++;
				System.out.println(top);
			}
			if(els>max && !top.equals("Elsie")) {
				max = bess;
				top = "Elsie";
				rep++;
				System.out.println(top);
			}
			inp.remove(lowj);
		}
		System.out.println(rep);
	}
}
