package number_programming;

import java.util.Scanner;

public class Program13_PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number Reverse :");
		int num = sc.nextInt();
		int a = num;
		int rev = 0;
		while (num > 0) {
			int rem = num % 10;

			rev = rev * 10 + rem;

			num /= 10;
		}
		if (rev == a) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome !!!");
		}
	}
}
