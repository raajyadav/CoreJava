package streamAPI;

import java.util.ArrayList;


public class Program12{
	public static void main(String[] args) {
			
			ArrayList<Integer> l1=new ArrayList<>();
			l1.add(10);l1.add(13);l1.add(17);l1.add(16);l1.add(24);
			l1.stream().forEach(n->System.out.print(n+" "));
			
	}

}