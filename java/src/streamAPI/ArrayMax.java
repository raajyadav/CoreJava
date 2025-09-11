package streamAPI;

import java.util.Arrays;

public class ArrayMax {

	public static void main(String[] args) {
		//get Max of Array Element
		int[] x = {1,3,24,5,22};
		int max = Arrays.stream(x).max().orElse(0);
		System.out.println("Max : "+max);
	}
}
