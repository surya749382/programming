package string_programming;

import java.util.Scanner;

public class Program001_FirstNonRepeatingCharacter {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Book Name : ");
		String s = sc.next();
		System.out.println(getIndexOfUnique(s));
		
		
	}
	public static int getIndexOfUnique(String s) {
		
		char[] ch = s.toCharArray();
		
		int start = 0;
		int end = ch.length -1;
		
		for(int i = start; i<= end; i++) {
			int count = 0;
			for(int j = i+1; j<= end; j++) {
				if(ch[i] == ch[j]) {
					count++;
					break;
				}
			}
			if(count == 0) {
				return i;
			}
		}
		
		
		return -1;
	}

}
