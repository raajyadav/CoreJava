package comparableProgram;

public class Laptop implements Comparable<Laptop>{

	String brand;
	int ram;
	int storage;
	
	Laptop(String brand, int ram, int storage){
		this.brand=brand;
		this.ram=ram;
		this.storage=storage;
	}
	
	public String toString() {
		return "Brand is: "+brand+"\tRAM is: "+ram+"GB"+"\tStorage is: "+storage+"GB";
	}
//	Sorting on Brand
//	public int compareTo(Laptop l) {
//		return this.brand.compareToIgnoreCase(l.brand);
//	}
	
//	Sorting on RAM 
	public int compareTo(Laptop l) {
		return Integer.compare(this.ram, l.ram);
	}
	
//	Sorting on Storage
//	public int compareTo(Laptop l) {
//		return Integer.compare(this.storage,l.storage);
//	}
}
