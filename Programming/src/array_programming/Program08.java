package array_programming;

public class Program08{

	public static void main(String[] args) {
		String arr[] = { "Hello", "Motto", "ka", "hal", "chal", "ba", "aur", "pardeshi", "k", "ka","haal chal ba" };
		int largest = Integer.MIN_VALUE;
		int smallest =Integer.MAX_VALUE;
		StringBuilder largestString = new StringBuilder();
		StringBuilder smallestString = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			StringBuilder str = new StringBuilder(arr[i]);
			
			if(largest < str.length()) {
				largest = str.length();
				largestString = new StringBuilder(arr[i]);
				
			}
			if(smallest > str.length()) {
				smallest = str.length();
				smallestString = new StringBuilder(arr[i]);
				
			}
			
		}
		System.out.println("The largest string is : "+ largestString + " and length is " + largest );
		System.out.println("The smallest string is : "+ smallestString + " and length is " + smallest );
	}
}

