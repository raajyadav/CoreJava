package comparableProgram;

public class Product implements Comparable<Product>{
	
	String name;
	double price;
	int model;
	
	Product(String name, double price, int model){
	  this.name=name;
	  this.price=price;
	  this.model=model;
	}

	public String toString() {
		return "Name is: "+name+"\t Price is: "+price+"\t Model is: "+model;
	}
//	Sorting on Name
//	public int compareTo(Product p) {
//		return this.name.compareToIgnoreCase(p.name);
//	}
	
//	Sorting on Price 
//	public int compareTo(Product p) {
//		return Double.compare(this.price, p.price);
//	}
	
//	Sorting on Model 
	public int compareTo(Product p) {
		return Integer.compare(this.model, p.model);
	}
	
}
