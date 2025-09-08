package mutuableClass;

public class Fruit {

	String name;
	double price;
	String color;
	
	public void eat() {
		System.out.println("Eat Fruit");
	}
	
	public static void main(String[] args) {
		Fruit f1 = new Fruit();
		f1.eat();
	}
	
}
