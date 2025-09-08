package initilizationOfObject;

public class LaptopDriver {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop();
		Laptop l3 = new Laptop();
		
		l1.setDetails("Dell"," 2012", 45000);
		l2.setDetails("Mac", "2013", 80000);
		l3.setDetails("Samsung", "2022", 50000);
		
		System.out.println(l1.getDetails());
		System.out.println(l2.getDetails());
		System.out.println(l3.getDetails());
	}
}
