package palindrome;

import java.util.Comparator;

public class ValueComparator implements Comparator<String> {

	@Override
	public int compare(String x, String y) {
		if (x.length() >= y.length()) {
			return -1;
		} else {
			return 1;
		}

	}

}
