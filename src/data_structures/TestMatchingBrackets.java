package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		int track = 0;
		for(int i = 0; i<b.length(); i++) {
			if (b.charAt(i) == '}') {
				track--;
			}
			else if (b.charAt(i) == '{') {
				track++;
			}
			if(track<0) {
				return false;
			}
		}
		if(track == 0) {
			return true;
		}
		return false;
	}

}