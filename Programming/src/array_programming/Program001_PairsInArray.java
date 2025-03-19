package array_programming;

public class Program001_PairsInArray {
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10};
		System.out.println("Total numbers of pairs is : " + pairInArray(arr));
	}

	public static int pairInArray(int[] a) {
		int totalPairs = 0;
		int start = 0;
		int end = a.length-1;
		
		for(int i = 0; i < end; i++ ) {
			for(int j = i+1; j <= end; j++) {
				System.out.print(" ( " + a[i]+ "," + a[j] + " ) ");
				totalPairs++;
				
			}
			System.out.println();
		}
		
		return totalPairs;
	}
}
