package array_programming;

public class Program11{

	public static void main(String[] args) {
		String arr[] = { "Surya", "Pratik", "Rahul", "Shreyansh", "Prince", "Anshika", "Sakshi", "Anuradha" };
		
		indexElementChanger(1, 0, arr);
		
	}
	
	public static void indexElementChanger(int i, int j, String[] array) {
		if(array.length < i || array.length < j) {
			System.out.println("Provided index is not present in Array");
			return;
		}
		String temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
		for(int k = 0; k < array.length; k++) {
			
			System.out.print(array[k]+ " ");
		}
	}
}

