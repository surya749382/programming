package pattern_programming;

import java.util.Scanner;

public class Program21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		
		for(int i = 0; i < row ; i++) {
			char ch = 'A';
			for(int j= 1; j<= row ; j++) {
				
				System.out.print(ch + " ");
				ch = (char)('A' + j);
			}
		
			System.out.println();
		}
	}

}
