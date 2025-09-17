package comparableProgram;

public class Shirt implements Comparable<Shirt>{
	
	String brand;
	String color;
	double price;
	
	Shirt(String brand, String color, double price){
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	public String toString() {
		return "Brand is: "+brand+"\tColor is: "+color+"\t Price is: "+price;
	}
//	Sorting on Brand 
//	public int compareTo(Shirt s) {
//		return this.brand.compareToIgnoreCase(s.brand);
//	}
	
//	Sorting on Color
//	public int compareTo(Shirt s) {
//		return this.color.compareToIgnoreCase(s.color);
//	}
	
//	Sorting on Price
	public int compareTo(Shirt s) {
		return Double.compare(this.price, s.price);
	}

}
