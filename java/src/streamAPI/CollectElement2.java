package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectElement2 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(12);
		l1.add(13);
		l1.add(11);
		l1.add(10);
		
		//Here List<Integer> refrence is casted into ArrayList<Integer>
		l1 = (ArrayList<Integer>) l1.stream().sorted().collect(Collectors.toList());
		System.out.println("List is: "+l1);
	}
}
