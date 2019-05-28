import java.util.Arrays;

public class ITC155_Assignment7 {
	//Will not be faster than the standard sort
	//BigOh = O(N^2)

	public static void main(String[] args) {
		int [] list = {7, 2, 3, 6, 8, 1, 5};
			
		selectionSort(list);
		System.out.println(Arrays.toString(list));
	}
	
	public static void selectionSort(int[] a) {
		for (int i = a.length -1; i >= 0; i--) {
			//find index of largest element
			int n = i;
			for (int j = i - 1; j >= 0; j--) {
				if (a[n] < a[j]) {
					n = j;
				}
			}
			swap(a, i, n); //swap largest to back
		}
		
	}

	private static void swap(int[] a, int i, int n) {
		int temp = a[i];
		a[i] = a[n];
		a[n] = temp;
		
	}

}
