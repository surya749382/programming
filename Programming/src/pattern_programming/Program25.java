package pattern_programming;
import java.util.Scanner;

public class Program25 {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number of rows : ");
	 int row = sc.nextInt();
	 char ch = 'A';
	 for(int i= 1; i<= row ; i++) {
		 ch = (char)('A' + i -1);
		 for(int j= 1; j<= row; j++ ) {
			 if(i==1|| j==1 || i== row|| j== row) {
				 System.out.print(ch +" ");
			 }else if(i == (row+1)/2 && j == (row+1)/2) {
				 System.out.print("* ");
				 
			 }else {
				 System.out.print("  ");
			 }
		 }
		 System.out.println();
	 }
			 
	}
}
