
package array_programming;

public class Program30 {

	public static void main(String[] args) {
		int[] a = {12,12,23,23,12,45,12,76,1001,1001,20,12};
		getOddFrequency(a);
	
		
	}
	
	public static  void getOddFrequency(int[] a) {
		int start = 0;
		int end = a.length-1;
		
		for(int i= start; i< end; i++) {
			int count = 1;
			for(int j = i+1; j<= end; j++) {
				if(a[i]== a[j]) {
					count++;
					int temp = a[j];
					a[j]= a[end];
					a[end] =temp;
					end--;	j--;
				
				}
			}
	
			if(count%2==1) {
				System.out.println("The frequency of "+ a[i] + " is : "+count);
				
			}
				

		}
	}
}
