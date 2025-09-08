package genericsClass;



public class BoxDriver {

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>(12);
		Box<Double> b2 = new Box<>(100.4);
		Box<String> b3 = new Box<>("Mohan");
		Box<Car> b4=new Box<>(new Car());
		
		b1.printValue();
		b2.printValue();
		b3.printValue();
		b4.printValue();
	}
}
