package number_programming;

import java.util.Scanner;

public class Program05_PrintDigitAndCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print the digit : ");
		int num = sc.nextInt();
		int count = 0;
		while(num > 0) {
			int rem = num % 10;
			count++;
			num /=10;
			System.out.print(rem +" ");
		}
		System.out.println("\nThe total number of digits is : "+ count);
	}
}
