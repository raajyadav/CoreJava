package shirtProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Service {

	private List<Shirt> l1 = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);

	public void addShirt(Shirt s) {
		l1.add(s);
	}

	public void displayAllShirt() {
		for (Shirt s : l1) {
			System.out.println(s);
		}
	}

	public void filterOnBrandAndSize() {
		System.out.println("Enter the Brand: ");
		String brand = sc.nextLine();
		System.out.println("Enter the Size: ");
		int size = sc.nextInt();
		int count = 0;
		for (Shirt s : l1) {
			if (s.brand.equalsIgnoreCase(brand) && s.size == size) {
				System.out.println(s);
				count++;
			}
		}
		if (count == 0)
			System.out.println("No such Item Found!!");
	}

	public void filterOnPrice() {
		System.out.println("Enter the price range");
		double price = sc.nextDouble();
		boolean found = false;
		for (Shirt s : l1) {
			if (s.price <= price) {
				System.out.println(s);
				found = true;
			}

		}
		if(!found) {
			System.out.println("No such item found");
		}

	}
	public void filterOnSizeAndPrice() {
		System.out.println("Enter the Size");
		int size = sc.nextInt();
		System.out.println("Enter the Price");
		double price =sc.nextDouble();
		boolean found = false;
		for(Shirt s:l1) {
			if(s.size == size && s.price <= price) {
				System.out.println(s);
				found = true;
			}
		}
		if(!found) {
			System.out.println("No such item found");
		}
	}
	
	public void filterPriceLowToHigh() {
	    System.out.println("Enter Price: ");
	    double price = sc.nextDouble();

	    // Create a temporary list for matching shirts
	    List<Shirt> filtered = new ArrayList<>();

	    for (Shirt s : l1) {
	        if (s.price <= price) {
	            filtered.add(s);
	        }
	    }

	    if (filtered.isEmpty()) {
	        System.out.println("No such item found!!");
	        return;
	    }

	    // Sort filtered shirts by price (low → high)
	    Collections.sort(filtered, (s1, s2) -> Double.compare(s1.price, s2.price));

	    System.out.println("Shirts under " + price + " sorted by price (low → high):");
	    for (Shirt s : filtered) {
	        System.out.println(s);
	    }
	}

	public void filterPriceHighToLow() {
	    System.out.println("Enter Price: ");
	    double price = sc.nextDouble();

	    // Create a temporary list for matching shirts
	    List<Shirt> filtered = new ArrayList<>();

	    for (Shirt s : l1) {
	        if (s.price <= price) {
	            filtered.add(s);
	        }
	    }

	    if (filtered.isEmpty()) {
	        System.out.println("No such item found!!");
	        return;
	    }

	    // Sort filtered shirts by price (High → low)
	    Collections.sort(filtered, (s1, s2) -> Double.compare(s2.price, s1.price));

	    System.out.println("Shirts under " + price + " sorted by price (High → Low):");
	    for (Shirt s : filtered) {
	        System.out.println(s);
	    }
	}
	
	public void brandAvailable() {
		List<String> brands = new ArrayList<>();
		
		for(Shirt s:l1) {
			if(!brands.contains(s.brand)) {
				brands.add(s.brand);
			}
		}
		
		if(brands.isEmpty()) {
		    System.out.println("No brands available!!");
		}else {
			System.out.println("Available brands are: ");
			for(String b:brands) {
				System.out.println(b);
			}
		}
	}
	public void sizeAvailable() {
		List<Integer> size = new ArrayList<>();
		
		for(Shirt s:l1) {
			if(!size.contains(s.size)) {
				size.add(s.size);
			}
		}
		
		if(size.isEmpty()) {
			System.out.println("No size available!!");
		}else {
			System.out.println("Available size are: ");
			for(Integer s:size) {
				System.out.println(s);
			}
		}
	}
	
	public void countShirtOnBrand() {
		System.out.println("Enter the brand: ");
		String brand = sc.nextLine();
       
		long count = l1.stream().filter(s->s.brand.equalsIgnoreCase(brand)).count();
		
		if(count > 0)
			System.out.println("Total shirts available for " + brand + " = " + count);
		else
			System.out.println("No shirts available for that brand.");
	}
	public void countShirtsAllBrands() {
	    List<String> brands = new ArrayList<>();

	    // Step 1: collect unique brands
	    for (Shirt s : l1) {
	        if (!brands.contains(s.brand)) {
	            brands.add(s.brand);
	        }
	    }

	    // Step 2: count shirts for each brand
	    if (brands.isEmpty()) {
	        System.out.println("No shirts available.");
	    } else {
	        System.out.println("Shirt count for all brands:");
	        for (String brand : brands) {
	            int count = 0;
	            for (Shirt s : l1) {
	                if (s.brand.equalsIgnoreCase(brand)) {
	                    count++;
	                }
	            }
	            System.out.println(brand + " - " + count + " shirts");
	        }
	    }
	}

	
}
