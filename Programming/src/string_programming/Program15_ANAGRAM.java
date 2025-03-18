package string_programming;

import java.util.Arrays;
import java.util.Scanner;

public class Program15_ANAGRAM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str1 = sc.nextLine();
		System.out.println("Enter the string : ");
		String str2 = sc.nextLine();
		System.out.println(isANAGRAM(str1, str2));
	}
	public static boolean isANAGRAM	(String s1, String s2) {
		s1= s1.replaceAll("\\s", "").toLowerCase();
		s2=s2.replaceAll("\\s", "").toLowerCase();
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		char[] str1 = s1.toCharArray();
		char[] str2 = s1.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		if(Arrays.equals(str1, str2)) {
			return true;
		}else {
			return false;
		}

		
	}
}
