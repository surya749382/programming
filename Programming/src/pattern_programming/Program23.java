package pattern_programming;

import java.util.Scanner;

public class Program23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		int space = row ;
		for(int i = 0; i < row ; i++) {
			char ch = (char)('A' + i);
			for(int j=space; j> 1; j--) {
				System.out.print("  ");
			}
			for(int j= 1; j <=i+1; j++) {
				System.out.print(ch + " ");
			}
			space--;
			System.out.println();
		}
	}

}
