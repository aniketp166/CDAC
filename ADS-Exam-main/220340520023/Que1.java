import java.util.*;

class InsertionSort {

	public static void main (String... args) {
		int a1[] = {2, 4, 6, 8, 3};
		int n = a1.length;
		for (int i = n-1; i>=0; i--) {
			int temp = a1[i];
			int j;
			for(j=i-1; j>=0 && a1[j]>temp; j--) {
			a1[j+1] = a1[j];
			
			System.out.println(Arrays.toString(a1));
			}
			a1[j+1] = temp;
		}
			System.out.println(Arrays.toString(a1));
	
	}
}