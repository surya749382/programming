package pattern_programming;

import java.util.Scanner;

public class Program02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row :");
		int row = sc.nextInt();
		System.out.println("Enter the number of colomn:");
		int col = sc.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				System.out.print("("+i+","+j+")  ");
			}
			System.out.println();
		}
	}	
}
