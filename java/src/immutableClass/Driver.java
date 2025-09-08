package immutableClass;

public class Driver {
	
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Samsung",343434,8);
	   System.out.println("Name is: "+m1.getName());
		System.out.println("Price is: "+m1.getPrice());
		System.out.println("RAM is: "+m1.getRAM());
	}

}
