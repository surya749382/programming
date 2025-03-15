package number_programming;

import java.util.Scanner;

public class Program04_PrintDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print the digit : ");
		int num = sc.nextInt();
		
		while(num > 0) {
			int rem = num % 10;
			
			num /=10;
			System.out.print(rem +" ");
		}
	}
}
