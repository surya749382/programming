package number_programming;

public class Program14_PerfectNumberUpto {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i <= 1000; i++) {
			boolean condition=isPerfect(i);
			if(condition) {
				System.out.print(i + " ");
				count++;
			}
		}
	
		System.out.println("\nTotal number of perfect number is :" + count);
	}
	
	public static boolean isPerfect(int num) {	
		
		int sum = 0;
		for(int i = 1; i<= num/2; i++ ) {
			if(num%i==0) {
				sum = sum+i;
			}
		}
		if(num == sum) {
			return true;
		}else {
			return false;
		}
	}
}
