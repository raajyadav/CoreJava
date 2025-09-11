package streamAPI;

import java.util.Arrays;

public class ArrayAvg {

	public static void main(String[] args) {
		//get average from array element
		double []x = {1,2,3,4,5};
		double avg = Arrays.stream(x).average().orElse(0);
		System.out.println(avg);
	}
}
