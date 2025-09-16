package collectionFramework;

import java.util.Arrays;

public class Program31 {

	public static void main(String[] args) {
		int [] a = {12, 18, 20, 38, 48, 53, 60, 70, 86};
		int n = 21;
		int index = Arrays.binarySearch(a,n);
//		System.out.println(index);
		if(index > 0) {
			System.out.println(n+" is Found at index: "+index);
		}else {
			System.out.println(n+" is not Found but can fit at index: "+(index+1)*-1);
		}
	}
}
