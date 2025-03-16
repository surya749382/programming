package number_programming;

import java.util.Scanner;

public class Program15_PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check Prime :");
		int num = sc.nextInt();
		boolean condition = true;
		for(int i = 2; i<= Math.sqrt(num); i++) {
			if(num % i == 0) {
				condition = false;
				break;
			}
		}
		if(condition) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number !!");
		}
	}
}
