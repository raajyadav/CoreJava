package initilizationOfObject;

public class FruitDriver {
	
	public static void main(String[] args) {
		
		Fruit f1 = new Fruit();
		Fruit f2 = new Fruit();
		Fruit f3 = new Fruit();
		
		f1.setDetails("Mango","Yellow",50);
		f2.setDetails("Grapes", "Green",40);
		f3.setDetails("Banana", "Yellow",60);
		
		System.out.println(f1.getDetails());
		System.out.println(f2.getDetails());
		System.out.println(f3.getDetails());
	}

}
