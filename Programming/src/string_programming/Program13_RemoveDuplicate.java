package string_programming;

import java.util.Scanner;

public class Program13_RemoveDuplicate {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		
		System.out.println(getUniqueCharacters(str));
		
		
	}
	public static String getUniqueCharacters(String str) {
		String newStr = "";
		
		char[] s1 = str.toCharArray();
		
		int start = 0;
		int end = s1.length-1;
		
		for(int i = start; i <= end; i++) {
			for(int j = i+1; j < end; j++) {
				if(s1[i]== s1[j]) {
					char temp = s1[j];
					s1[j] = s1[end];
					s1[end] = temp;
					 
					end--; j--;
				}
			}
		}
		
		for(int i = start; i < end; i++ ) {
			newStr = newStr + s1[i];
		}
		
		return newStr;
		
	}

}
