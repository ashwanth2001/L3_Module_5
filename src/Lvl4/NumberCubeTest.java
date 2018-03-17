package Lvl4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberCubeTest {

	/* READ QUESTION 1: http://apcentral.collegeboard.com/apc/public/repository/ap09_frq_computer_science_a.pdf Try to answer on paper.
*/

	@Test
	public void testPartA() {
		NumberCube numberCube = new NumberCube();
		int[] testValues = { 3, 2, 5, 6, 1 };
		numberCube.setValues(testValues);
		assertArrayEquals(testValues, NumberCube.getCubeTosses(numberCube, testValues.length));
	}

	@Test
	public void testPartB() throws Exception {
		int[] testValues = { 1, 5, 5, 2, 2, 2, 5, 5};
		assertEquals(3, NumberCube.getLongestRun(testValues));
		int[] testValues2 = { 1, 5, 5, 4, 3, 1, 2, 2, 2, 2, 6, 1, 3, 3, 3, 5, 5, 5 };
		assertEquals(6, NumberCube.getLongestRun(testValues2));
	}

}

class NumberCube {

	int testIndex = 0;
	int[] values;

	public int toss() {
		return values[testIndex++];
	}

	public void setValues(int[] testValues) {
		this.values = testValues;

	}

	public int[] getValues() {
		return values;
	}
	
	public static int[] getCubeTosses(NumberCube cube, int numTosses) {
		int[] ret = new int[numTosses];
		for(int i = 0; i<numTosses; i++) {
			ret[i] = cube.toss();
		}
		return ret;
	}
	
	public static int getLongestRun(int[] values) {
		int count = 1;
		int num = 0;
		int curr = 0;
		int ind = 0;
		for(int i = 0; i<values.length; i++) {
			if(num == values[i]) {
				curr++;
			}
			else {
				num = values[i];
				curr = 1;
			}
			
			if(curr>count) {
				count = curr;
				ind = i+1-curr;
			}
		}
		if(count < 2)
			count = -1;
		return ind;
	}
}

