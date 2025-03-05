package pattern_programming;

import java.util.Scanner;

public class Program35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		int space = (row+1)/2;
		int star = 1;
		char ch = 'A';
		for(int i = 0; i<row ; i++) {
			
			for(int j=space; j>=0; j--) {
				System.out.print("  ");
			}
			for(int j = 1 ; j <=star ; j++ ) {
				System.out.print((char)(ch) +" ");
				ch = (char)(ch+1);
			}
		   space-=1;
		   star +=2;
		   System.out.println();
		}
				
	}

}
