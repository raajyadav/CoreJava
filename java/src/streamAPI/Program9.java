package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class Program9 {

	public static void main(String[] args) {
		//Print all the element of List in UpperCase and print it
		List<String> l1 = new ArrayList<>();
       
        l1.add("Raj");
        l1.add("Mohan");
        l1.add("raju");
        
        l1.stream().map(n->n.toUpperCase()).forEach(n->System.out.println(n+" "));
	}
}
