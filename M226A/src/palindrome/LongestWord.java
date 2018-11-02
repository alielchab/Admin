package palindrome;

import java.util.Map;

public class LongestWord extends SuperPalindrome {

	@Override
	public String wordPicker(Map<String, Integer> map) {
		Map.Entry<String, Integer> entry = map.entrySet().iterator().next();
		longestPalidromWord = entry.getKey();
		return longestPalidromWord;
	}

	@Override
	public void writeMethodPicker() {
		writeFile(0);

	}
}
