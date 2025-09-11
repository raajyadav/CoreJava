package streamAPI;

import java.util.Arrays;

public class ArrayProgram2 {

	public static void main(String[] args) {
		//Print all even elements of Array
		int[] x = {10,12,22,3,99,22};
		
		Arrays.stream(x).filter(n->n%2 == 0).forEach(n->System.out.print(n+" "));
	}
}
