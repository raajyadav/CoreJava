package comparableProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductDriver {

	public static void main(String[] args) {
		List<Product> p1 = new ArrayList<>();
		p1.add(new Product("TATA",202200.7, 2012));
		p1.add(new Product("BMW", 304303.44, 2019));
		p1.add(new Product("Toyota", 200302.33, 2020));
		p1.add(new Product("Hundai", 302020.8, 2021));
		System.out.println("============All Products are==================");
		for(Product p:p1) {
			System.out.println(p);
			
		}
		System.out.println("=============All Product Sorted on Name=============");
		Collections.sort(p1);
		for(Product p:p1) {
			System.out.println(p);
		}
//		System.out.println("=============All Product Sorted on Price=============");
//		Collections.sort(p1);
//		for(Product p:p1) {
//			System.out.println(p);
//		}
//		System.out.println("=============All Product Sorted on Model=============");
//		Collections.sort(p1);
//		for(Product p:p1) {
//			System.out.println(p);
//		}
		
	}
}
