package multiThreading;

public class User extends Human implements Runnable{

	String name;
	
	User(String name){
		this.name=name;
	}
	
	public void run() {
		buy();
	}
	public void buy() {
		System.out.println("=============="+name+" has started buying"+"=================");
		System.out.println(name+" has added in cart the item");
		System.out.println(name+" is paying ");
		System.out.println(name+" payment is succefully done!");
		System.out.println("============"+name+" has completed the process!"+"================");
	}
}
