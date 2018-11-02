package palindromeTest;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

import palindrome.SuperPalindrome;
import palindrome.LongestWord;
import palindrome.ThreeLongestWordsCounted;

class LongestPalindromeTest {

	List<String> list = new ArrayList<String>();
	String s = "good";
	Scanner sc;
	SuperPalindrome testee;

	LongestWord longestWordTestee = new LongestWord();
	ThreeLongestWordsCounted threeLongestWordsCountedTestee = new ThreeLongestWordsCounted();

	Map<String, Integer> map = new TreeMap<String, Integer>();

	public LongestPalindromeTest() throws FileNotFoundException {
//		sc = new Scanner(new File("words.txt"));

		list.add("lol");

		map.put("Hello", 4);
		map.put("Goodbye", 7);
		map.put("Fish", 4);
		map.put("Monkey", 6);

		testee = new SuperPalindrome() {

			@Override
			public String wordPicker(Map<String, Integer> map) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void writeMethodPicker() {
				// TODO Auto-generated method stub

			}
		};
	}

	@Test
	void shouldGiveLenghtOfString() {
		assertEquals(3, testee.getLenghtOfWordInList(list));
	}

	@Test
	void checkIfPalidromWord() {
		assertEquals(true, testee.checkIfPalindrom("lol"));
		assertEquals(false, testee.checkIfPalindrom("djlewqdjewq"));
		assertEquals(true, testee.checkIfPalindrom("...Anna..."));
		assertEquals(false, testee.checkIfPalindrom("Hello"));
		assertEquals(true, testee.checkIfPalindrom("lol"));
		assertEquals(true, testee.checkIfPalindrom("abbA"));

	}

	@Test
	void ShouldReturnCleanString() {
		assertEquals("hallo", testee.wordCleaner("Hallo!"));
		assertEquals("fish", testee.wordCleaner("Fish???"));
		assertEquals("lol", testee.wordCleaner("lol..."));
		assertEquals("lol", testee.wordCleaner("...lOl"));
		assertEquals("hallo", testee.wordCleaner("hAllo!!"));
		assertEquals("hallo", testee.wordCleaner("<hAllo!!"));

	}

	@Test
	void ShouldReturnFirstWordsAsString() {
		assertEquals("Fish", longestWordTestee.wordPicker(map));
	}

	@Test
	void ShouldReturnFirstThreeWordsAsString() {
		assertEquals("{Hello=4, Fish=4, Goodbye=7}", threeLongestWordsCountedTestee.wordPicker(map));
	}

	@Test
	void shouldReturnTheRequestedAmountOfEntries() {
		Map<String, Integer> resultMap = new TreeMap<String, Integer>();
		resultMap.put("Fish", 4);
		resultMap.put("Goodbye", 7);
		resultMap.put("Hello", 4);
		assertEquals(resultMap, threeLongestWordsCountedTestee.getAmountOfEntries(3, map));

	}
}
