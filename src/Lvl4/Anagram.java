package Lvl4;

import java.util.ArrayList;

public class Anagram {

	public static void main(String[] args) {
		String s = "abcd";
		ArrayList<String> dict = new ArrayList<String>();
		dict.add("cool");
		dict.add("loco");
		permutation("", s);

	}

	public static void permutation(String perm, String word) {
		if (word.isEmpty()) {
			System.out.println(perm);
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
