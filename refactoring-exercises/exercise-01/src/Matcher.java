public class Matcher {

	/*
	 *  length check was after cliping elements, so I moved it at first place
	 *  delta check was in another for loop that was the same as first one, so I moved it into first one
	 *  there were no brackets after ifs and for loops
	 */

	public boolean match(int[] expected, int[] actual, int clipLimit, int delta) {

		// Check for length differences
		if (actual.length != expected.length) return false;

		for (int i = 0; i < actual.length; i++) {
			if (actual[i] > clipLimit) { // Clip "too-large" values
				actual[i] = clipLimit;
			} else if (Math.abs(expected[i] - actual[i]) > delta) { // Check that each entry within expected +/- delta
				return false;
			}
		}
		return true;
	}
}