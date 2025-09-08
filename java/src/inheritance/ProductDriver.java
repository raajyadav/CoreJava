package inheritance;

public class ProductDriver {

	public static void main(String[] args) {
		Shirt s1 = new Shirt();
		Shirt s2 = new Shirt("Formal",800,"TOM HATTON","XL","BLACK");
		Shirt s3 = new Shirt("Check",700, "SIYA RAM", "XXL","WHITE");
		
		System.out.println(s1.getShirtDetails());
		System.out.println(s2.getShirtDetails());
		System.out.println(s3.getShirtDetails());
	}
}
