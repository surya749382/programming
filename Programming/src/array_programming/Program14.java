package array_programming;

import java.util.Scanner;

public class Program14 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the numer ");
		int num = sc.nextInt();
		
		String arr[]= {"EVEN","ODD"};
		
		System.out.println("The given number is : " + arr[num%2]);
	}
}
