
public class Frequency {

	public static void main(String[] args) {
		int[] a = {12,23,23,12,45,12,76,20,12};
		getFrequency(a);
	}
	
	public static void getFrequency(int[] a) {
		int[] x = new int[1001];
		for(int i = 0; i < a.length; i++) {
			x[a[i]]++;
		}
		for(int i = 0; i< x.length; i++) {
			if(x[i]> 0) {
				System.out.println(i + " is "+ x[i]+ " times");
			}
		}
	}
}
