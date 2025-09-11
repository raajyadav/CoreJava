package streamAPI;

import java.util.Arrays;

public class ArrayMin {

	public static void main(String[] args) {
		//get min from array element
		int [] x = {4,2,1,4,5};
	int min = Arrays.stream(x).min().orElse(0);
	System.out.println("Min : "+min);
		
	}
}
