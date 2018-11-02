package palindrome;

import java.util.Scanner;

public class Control {
	public static void main(String[] args) {

		System.out.println("1. Longest palindrom\n2. The three longest palindroms");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.close();
		SuperPalindrome palindrome = null;
		if (i == 1) {
			palindrome = new LongestWord();			
		}
		if (i == 2) {
			palindrome = new ThreeLongestWordsCounted();			
		}
		palindrome.process();
	}

}
