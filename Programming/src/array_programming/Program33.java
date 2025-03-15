
package array_programming;

public class Program33 {

	public static void main(String[] args) {
		int[] a = {12,12,23,23,12,45,12,76,1001,1001,20,12};
		getUniqueArray(a);
	
		
	}
	
	public static  void getUniqueArray(int[] a) {
		
		int n = a.length;
		int uniqueArray[] = new int[n];
		int uniqueCount = 0;
		
		for(int i = 0; i < n; i++) {
			
			boolean isUniue = true;
			for(int j = 0; j< uniqueCount; j++ ) {
				if(a[i] == uniqueArray[j]) {
					isUniue = false;
					break;
				}
			}
			if(isUniue) {
				uniqueArray[uniqueCount] = a[i];
				uniqueCount++;
			}
		}
		
		for (int i = 0;  i< uniqueCount; i++) {
			System.out.print(uniqueArray[i] + " ");
		}
	}
}
