package streamAPI;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		int[] a = {3,6,7,3};
		
	int sum= Arrays.stream(a).sum();
	System.out.println("Sum : "+sum);
	}
}
