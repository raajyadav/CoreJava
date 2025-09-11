package streamAPI;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		int[] a= {12, 7, 10, 12, 7, 8, 10, 10};
		
		a=Arrays.stream(a).distinct().toArray();
		
		Arrays.stream(a).forEach(n->System.out.print(n+" "));
	}

}