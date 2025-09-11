package streamAPI;

import java.util.Arrays;
//remove duplicates
public class UniqueElementsOfArray {
	public static void main(String[] args) {
		int[] a= {12, 7, 10, 12, 7, 8, 10, 10};
		System.out.println(a);
		Arrays.stream(a).distinct().forEach(n->System.out.print(n+" "));
		System.out.println("\n===================");
		Arrays.stream(a).forEach(n->System.out.print(n+" "));
	}

}