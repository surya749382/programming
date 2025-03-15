package number_programming;

import java.util.Scanner;

public class Program08_DigitSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print the digit sum : ");
		long num = sc.nextLong();
		int sum = 0;
		while(num > 0) {
			int rem = (int)(num % 10);
			sum = sum + rem;
			num /=10;
			
		}
		System.out.println("The sum of digits  is : "+ sum);
	}
}
