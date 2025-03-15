package array_programming;

public class Program29 {

	public static void main(String[] args) {
		int[] a = {12,23,23,12,45,12,76,1001,1001,20,12};
		getDublicateFrequency(a);
	
		
	}
	
	public static  void getDublicateFrequency(int[] a) {
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
//			System.out.println("The frequency of "+ a[i] + " is : "+count);
			if(count>1) {
				System.out.print(a[i] + " ");
				
			}
				

		}
	}
}
