package pattern_programming;

import java.util.Scanner;

public class Program18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = sc.nextInt();

		for (int i = 0; i < row; i++) {
			for(int j= row-i; j>1; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print((j+1) % 2 + " ");

			}
			System.out.println();
		}
	}
}
