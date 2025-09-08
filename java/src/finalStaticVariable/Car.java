package finalStaticVariable;

public class Car {
	
	final static String brand;
	static {
		brand = "TATA";
	}

}

//Note:- A static final variable must be initilize at the declaration time or it should be initilize using static block