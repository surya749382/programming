package array_programming;

public class Program10{

	public static void main(String[] args) {
		String arr[] = { "Hello", "Motto", "ka", "hal", "chal", "ba", "aur", "pardeshi", "k", "ka","haal" };
		
		for (int i = arr.length-1; i >= 0; i--) {
			StringBuilder str = new StringBuilder(arr[i]);
			
			System.out.print(str + " ");
				
			i--;
			
		}
		
	}
}

