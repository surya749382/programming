package number_programming;

import java.util.Scanner;

public class Program11_PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check perfect or not :");
		int num = sc.nextInt();
		
		
		int sum = 0;
		for(int i = 1; i<= num/2; i++ ) {
			if(num%i==0) {
				sum = sum+i;
			}
		}
		if(num == sum) {
			System.out.println("Perfect Number ");
		}else {
			System.out.println("Not A Perfect Number");
		}
	}
}
