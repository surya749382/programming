package string_programming;

import java.util.Scanner;

public class Program12_isPalindromeWithoutReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string to check Palindrome : ");
		String s1 = sc.next();
		System.out.println(isPalindrome(s1));

	}

	public static String isPalindrome(String s1) {

		boolean condition = true;
		for (int i = 0; i < s1.length() / 2; i++) {
			if (s1.charAt(i) == s1.charAt(s1.length() - i - 1)) {
				condition = true;
			} else {
				condition = false;
				break;
			}
		}
		if (condition)
			return "Palindrome";
		else {
			return "Not Palindrome";
		}

	}

}
