package initilizationOfObject;

public class ObjectReference {
	
//	Better practise we take class name as Car . This is only for Understand 
	String name;
	int price;
	String color;
	
	public static void main(String[] args) {
		
		ObjectReference or1 = new ObjectReference();
		or1.name ="Tata";
		or1.price = 364364;
		or1.color = "Blue";
		
		ObjectReference or2 = new ObjectReference();
		or2.name = "BMW";
		or2.price = 234444;
		or2.color = "Yellow";
		
		System.out.println("Name is : "+or1.name);
		System.out.println("Price is : "+or1.price);
		System.out.println("Color is : "+or1.color);
		System.out.println("===============================");
		
		System.out.println("Name is : "+or2.name);
		System.out.println("Price is : "+or2.price);
		System.out.println("Color is : "+or2.color);
	}

}
