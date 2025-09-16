package collectionFramework;

import java.util.Arrays;

public class Program32 {

	public static void main(String[] args) {
		int [] a = {12, 28};
		int [] b = {12,18,10,50,40};
		int x = Arrays.compare(a, b);
		System.out.println(x);
		Arrays.parallelSort(b);
		System.out.println(Arrays.toString(b));
	}
}
