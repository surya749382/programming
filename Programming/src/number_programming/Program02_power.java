package number_programming;

import java.util.Scanner;

public class Program02_power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base : ");
		int a = sc.nextInt();
		System.out.println("Enter the power :  ");
		int b = sc.nextInt();
		int num = 1;
		int value = 1;
		while(num <= b) {
			value= value*a;
			num++;
		}
		System.out.println("The value of "+  a + " power "+ b + " is " + value);
		
		
	}
}
