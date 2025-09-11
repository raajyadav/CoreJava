package streamAPI;

import java.util.Arrays;

public class ArrayProgram3 {

	public static void main(String[] args) {
		//Remove Duplicate from array
		
		int[] x = {10,11,12,11,12,13};
	   x = Arrays.stream(x).distinct().toArray();
	   System.out.println(x);
	   
	   Arrays.stream(x).distinct().forEach(n->System.out.print(n+" "));
	}
}
