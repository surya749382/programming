package string_programming;

public class Program00_numberSum {
	
	public static void main(String[] args) {
		String s1 = "13ajf454gaj5laigfda";
		
		String[] x = s1.split("[A-Za-z]+");
		int sum = 0;
		for (String p : x) {
			sum = sum +Integer.parseInt(p);
			
		}
		System.out.println("Sum is "+ sum);
	}

}
