package pattern_programming;

import java.util.Scanner;

public class Program20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		char ch= 65;
		for(int i = 1; i <= row ; i++) {
			for(int j= 1; j<= row ; j++) {
				System.out.print(ch++ +" ");
				
			}
			System.out.println();
		}
	}

}
