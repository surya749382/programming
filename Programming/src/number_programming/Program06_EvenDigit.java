package number_programming;
import java.util.Scanner;

public class Program06_EvenDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print the digit : ");
		int num = sc.nextInt();
		int count = 0;
		while(num > 0) {
			int rem = num % 10;
			
			num /=10;
			if(rem%2==0) {
				System.out.print(rem +" ");
				count++;
			}
		}
		System.out.println("\nThe total number of even digits is : "+ count);
	}
}
