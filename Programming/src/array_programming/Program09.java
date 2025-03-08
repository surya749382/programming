package array_programming;

public class Program09{

	public static void main(String[] args) {
		String arr[] = { "Hello", "Motto", "ka", "hal", "chal", "ba" };
		
		for (int i = 0; i < arr.length; i++) {
			StringBuilder str = new StringBuilder(arr[i]);
			String reverse = "";
			
			for(int j = 0 ; j < str.length(); j++) {
				reverse = str.charAt(j) + reverse; 
			}
			System.out.print(reverse + " ");
			
		}
		
	}
}

