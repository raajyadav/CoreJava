package initilizationOfObject;

public class ByNonStaticMethod {
	String name;
	int price;
	String color;
	
	public void setName(String name, int price, String color) {
		this.name=name;
		this.price=price;
		this.color=color;
	}
	public String getName() {
		return "Name is:"+name+"\nPrice is: "+"Rs "+price+"\nColor is: "+color; 
	}
	
	public static void main(String[] args) {
		ByNonStaticMethod b1 = new ByNonStaticMethod();
		b1.setName("TATA", 4533334, "Yellow");
		
		System.out.println(b1.getName());
	}

}
