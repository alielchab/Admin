package palindrome;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public abstract class SuperPalindrome {

	List<String> palidromWords = new ArrayList<String>();

	Map<String, Integer> sortedPalidromWords = new TreeMap<String, Integer>(new ValueComparator());

	String longestPalidromWord;

	Set<String> forbiddenChars = new HashSet<String>();

	public SuperPalindrome() {
		forbiddenChars.add(" ");
		forbiddenChars.add(".");
		forbiddenChars.add(",");
		forbiddenChars.add("?");
		forbiddenChars.add("!");
		forbiddenChars.add("!");
		forbiddenChars.add("<");
		forbiddenChars.add(">");
		forbiddenChars.add("\r\n\r\n");
	}

	public void process() {

		transferFileIntoPalindrome(new File("text.txt"));

		getLenghtOfWordInList(palidromWords);

		wordPicker(sortedPalidromWords);

		writeMethodPicker();

		System.out.println(sortedPalidromWords);
	}

	public Scanner fileReader(File file) {
		Scanner wordInput = null;
		try {
			wordInput = new Scanner(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return wordInput;
	}

	public Boolean checkIfPalindrom(String s) {
		Boolean isPlaindrome = false;
		s = wordCleaner(s);
		String palidrom = new StringBuilder(s).reverse().toString();
		if (s.equals(palidrom)) {
			palidromWords.add(s);
			isPlaindrome = true;
		}
		return isPlaindrome;
	}

	public void transferFileIntoPalindrome(File file) {
		Scanner sc = fileReader(file);
		while (sc.hasNext()) {
			checkIfPalindrom(sc.next());
		}
	}

	
	public final String wordCleaner(String s) {

		s = s.toLowerCase();

		for (String b : forbiddenChars) {
			while (s.startsWith(b)) {
				s = s.substring(1);
			}
			while (s.endsWith(b)) {
				s = s.substring(0, s.length() - 1);
			}
			if (s.startsWith(b)) {
				s = s.substring(4);
			}

		}
		return s;
	}

	public int getLenghtOfWordInList(List<String> list) {
		int lenghth = 0;
		for (String s : list) {
			lenghth = s.length();
			sortedPalidromWords.put(s, lenghth);

		}
		return lenghth;
	}

	public void writeFile(int i) {
		PrintWriter writer = writerCreator();
		if (i == 1) {
			sortedPalidromWords.forEach((String, Integer) -> writer.write(String + "=" + Integer + "\n"));
		} else {
			writer.write(longestPalidromWord);
		}
		writer.flush();
		writer.close();

	}

	public PrintWriter writerCreator() {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("wordsOutput.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return writer;
	}

	public abstract void writeMethodPicker();

	public abstract String wordPicker(Map<String, Integer> map);

}
