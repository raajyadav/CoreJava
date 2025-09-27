package shirtProject;

import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		Service service = new Service();
//		=========Q1 add Shirt==================
		service.addShirt(new Shirt("Levis", 2300, "White", 40));
		service.addShirt(new Shirt("BB", 2300, "Black", 32));
		service.addShirt(new Shirt("Levis", 1300, "White", 34));
		service.addShirt(new Shirt("PEng", 2200, "Green", 30));
		service.addShirt(new Shirt("Levis", 3300, "Brown", 28));
		service.addShirt(new Shirt("BB", 1100, "Black", 32));
		service.addShirt(new Shirt("PEng", 2200, "Green", 32));
		service.addShirt(new Shirt("Levi", 1800, "BlueC", 32));  // color padded to 5 letters
		service.addShirt(new Shirt("Nike", 2500, "RedXX", 36));
		service.addShirt(new Shirt("Puma", 2100, "White", 38));
		service.addShirt(new Shirt("Reeb", 1900, "GreyX", 34));
		service.addShirt(new Shirt("Adid", 2000, "Black", 32));
		service.addShirt(new Shirt("Fila", 2300, "PinkY", 36));
		service.addShirt(new Shirt("Kiki", 2200, "Green", 32));
		service.addShirt(new Shirt("BOSS", 3000, "Brown", 40));
		service.addShirt(new Shirt("HUGO", 2800, "BlueZ", 38));
		service.addShirt(new Shirt("Zara", 2000, "White", 34));
		service.addShirt(new Shirt("Levi", 1900, "Black", 36));
		service.addShirt(new Shirt("Nike", 2600, "Green", 32));
		service.addShirt(new Shirt("Puma", 2200, "Orang", 34));
		service.addShirt(new Shirt("Reeb", 2100, "RedXX", 36));
		service.addShirt(new Shirt("Fila", 2400, "Yello", 38));
		service.addShirt(new Shirt("Kiki", 2000, "White", 32));
		service.addShirt(new Shirt("BOSS", 3100, "Black", 40));
		service.addShirt(new Shirt("HUGO", 2700, "GreyX", 36));
		service.addShirt(new Shirt("Zara", 2100, "BlueZ", 34));
		service.addShirt(new Shirt("Levi", 2000, "DarkB", 36));

		//==========Q2 access All Shirt ===========	
		System.out.println("==============================Q2. All Shirts are==================");
		service.displayAllShirt();
	
//		================Q3 filter on brand and size ====================
//		System.out.println("=====================Q4.filter on brand and size===========================");
//		service.filterOnBrandAndSize();
//		
//		================Q3 filter on Price ====================
//		System.out.println("=====================Q4.filter on Price===========================");
//        service.filterOnPrice();
//       
//		================Q5 filter on size and price ====================
//		System.out.println("=====================Q5.filter on size and price===========================");
//        service.filterOnSizeAndPrice();
		
//		================Q6 Sort all shirts on price low to high =====================
//		System.out.println("================Sort all shirts on price low to high==============");
//        service.filterPriceLowToHigh();
//        
//		================Q7 Sort all shirts on price  high to low =====================
//		System.out.println("================Sort all shirts on price high to low==============");
//        service.filterPriceHighToLow();
		
//		==================Q8.List all the brands available====================
//		System.out.println("=====================List of All brands are=====================");
//		service.brandAvailable();
		
//		==================Q9.List all the Size available====================
//		System.out.println("=========================List all the Size available===========================");
//		service.sizeAvailable();
		
//		==========Q10Count the number of shirts available for a particular brand as per user input===============
//		System.out.println("=================Q10.Shirt Available on the brand=====================");
//		service.countShirtOnBrand();
		
//		============Q11Count the number of shirts available in all brands=======================
		System.out.println("=====================Q11 The number of shirts available in all brands======================");
		service.countShirtsAllBrands();
	}
	
}
