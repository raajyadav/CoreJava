package anonymousClassProgram;

public class FruitDriver {
	
	public static void main(String[] args) {
		Fruit f1 = new Mango();
		Fruit f2 = new Orange();
		
		
		f1.makeFruitSalad();
		f1.eat();
		System.out.println("=====================");
		f2.makeFruitSalad();
		f2.eat();
	}

}
