package pattern_programming;

import java.util.Scanner;

public class Program26 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ot rows : ");
		int row = sc.nextInt();
		
		for(int i= 0; i< row; i++) {
			for(int j=row; j>1+i; j-- ) {
				System.out.print("* ");
			}
			for(int j= 0; j< i; j++) {
				System.out.print("@ ");
			}
			System.out.println();
		}
	}
}
