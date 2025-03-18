package string_programming;

public class Program01_StringLength {
	public static void main(String[] args) {
		String str = "Hello";
		
		char[] strArr = str.toCharArray();
		int count = 0;
		for(char x : strArr) {
			count++;
			
		}
		System.out.println("Length of string is : "+ count);
	}

}
