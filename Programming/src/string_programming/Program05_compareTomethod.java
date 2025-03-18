package string_programming;

public class Program05_compareTomethod {
	
	public static void main(String[] args) {
//		 case -1
		String s1 = "Hello";
		String s2 = "";
		System.out.println(s1.compareTo(s2)); //5
		
//		case-2
		String s3 = "";
		String s4 = "Hello";
		System.out.println(s3.compareTo(s4)); //-5
		
//		case-3
		String s5 = "abcd";
		String s6 = "abad";
		System.out.println(s5.compareTo(s6)); //2
		
//		case-4
		String s7 = "cdef";
		String s8 = "ca";
		System.out.println(s7.compareTo(s8)); //3

//		case-5
		String s9 = "abcd";
		String s10 = "abcd";
		System.out.println(s9.compareTo(s10)); //0
		
//		case-6
		String s11 = "caefacd";
		String s12 = "ca";
		System.out.println(s11.compareTo(s12)); //5
				
	}

}
