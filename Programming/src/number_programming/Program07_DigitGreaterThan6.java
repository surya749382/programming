package number_programming;

import java.util.Scanner;

public class Program07_DigitGreaterThan6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print the digit : ");
		long num = sc.nextLong();
		int count = 0;
		while(num > 0) {
			long rem = num % 10;
			
			num /=10;
			if(rem>=6) {
				System.out.print(rem +" ");
				count++;
			}
		}
		System.out.println("\nThe total number of  digits is greater than or equal to 6 is : "+ count);
	}
}
