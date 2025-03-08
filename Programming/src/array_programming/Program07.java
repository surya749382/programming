package array_programming;

public class Program07{

	public static void main(String[] args) {
		String arr[] = { "Hello", "Motto", "ka", "hal", "chal", "ba", "aur", "pardeshi", "k", "ka","haal chal ba" };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			StringBuilder str = new StringBuilder(arr[i]);
			if(str.length()%2 == 0) {
				count+=1;
				System.out.print(str +" ");
				
			}
			
		}
		System.out.println("\nTotal number of even length string is : "+ count);
	}
}

