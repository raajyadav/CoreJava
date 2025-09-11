package streamAPI;

import java.util.Arrays;

public class ArrayProgram1 {
	
	public static void main(String[] args) {
		//Print all the Array Program
		
		int [] a = {10,11,12,11,8,5,19,10};
		System.out.println(a);
		Arrays.stream(a).forEach(n->System.out.print(n+" "));
	}

}
