package thisKeyword;

public class ConstructorDemo {

	 ConstructorDemo() {
		this(10);
		System.out.println("This is no parametrized constructor");
	}
	 ConstructorDemo(int i){
//		 this();
		 System.out.println("This is parametrized constructor");
	 }
}
