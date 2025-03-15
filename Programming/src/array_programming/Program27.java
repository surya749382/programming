package array_programming;

public class Program27 {
	public static void main(String[] args) {
		int[] a = {12,23,23,12,45,12,76,1001,1001,20,12};
		int start = 0;
		int end  = a.length-1;
		
		for(int i = start; i <= end; i++ ) {
			int count = 1;
			for(int j = i+1; j <= end ; j++) {
				if(a[i] == a[j] ) {
					count++;
					int temp = a[j];
					a[j] = a[end];
					a[end]= temp;
					j--;		
					end--; 
					
				}
			}
			System.out.println("The Frequency of "+ a[i] + " is "+ count);
		}
		
	}
}
// In this approach the sequence of unique element would be changed.