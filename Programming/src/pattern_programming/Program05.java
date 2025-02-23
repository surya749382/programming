package pattern_programming;

import java.util.Scanner;

public class Program05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row :");
		int row = sc.nextInt();
		System.out.println("Enter the number of colomn:");
		int col = sc.nextInt();
		int num = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				
				System.out.print(num+" ");
				num+=1;
			}
			System.out.println();
		}
	}	
}
