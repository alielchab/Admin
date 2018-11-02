package palindrome;

import java.util.HashMap;
import java.util.Map;

public class ThreeLongestWordsCounted extends SuperPalindrome {

	@Override
	public void writeMethodPicker() {
		writeFile(1);
	}

	@Override
	public String wordPicker(Map<String, Integer> map) {

		sortedPalidromWords = getAmountOfEntries(3, map);

		String threeLongestWords = sortedPalidromWords.toString();
		System.out.println(threeLongestWords);

		return threeLongestWords;
	}

	public Map<String, Integer> getAmountOfEntries(int max, Map<String, Integer> source) {
		int count = 0;

		Map<String, Integer> target = new HashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry : source.entrySet()) {
			if (count >= max)
				break;

			target.put(entry.getKey(), entry.getValue());
			count++;
		}
		return target;
	}
}
