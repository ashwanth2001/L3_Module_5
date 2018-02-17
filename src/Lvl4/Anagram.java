package Lvl4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Anagram {

	static ArrayList<String> ret = new ArrayList<String>();

	public static void main(String[] args) {
		String s = "firmon";
		ArrayList<String> dict = new ArrayList<String>();

		try {
			BufferedReader br = new BufferedReader(new FileReader("src/Lvl4/dict.txt"));

			String line = br.readLine();
			while (line != null) {
				dict.add(line);
				line = br.readLine();
			}

			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		permutation("", s);
		for (int i = 0; i < ret.size(); i++) {
			check(ret.get(i), dict);
		}
	}

	public static void permutation(String perm, String word) {
		if (word.isEmpty()) {
			ret.add(perm);
			// System.out.println(perm);
		} else {
			for (int i = 0; i < word.length(); i++) {
				// System.out.println(perm + word.charAt(i));
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}
	}

	public static void check(String s, ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if (s.equals(list.get(i))) {
				System.out.println(s);
				break;
			}
		}
	}

}
