package multiThreading;

public class FruitDriver {
 
	public static void main(String[] args) {
		
		System.out.println("Current Thread  is: "+Thread.currentThread());
		System.out.println("Current Thread Name is: "+Thread.currentThread().getName());
		System.out.println("Current Thread ID is: "+Thread.currentThread().getId());
		System.out.println("Current Thread Priority is: "+Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().isDaemon());
		
		System.out.println("======================================");
		
		Fruit f1=new Fruit("Mango");
		Fruit f2=new Fruit("Apple");
		Fruit f3=new Fruit("Orange");
		System.out.println(f1.toString());
		System.out.println(f2);
		System.out.println(f3);
		System.out.println("==============================");
		
		f1.setName(f1.name);
		f2.setName(f2.name);
		f3.setName(f3.name);
		
		f1.start();
		f2.start();
		f3.start();
	}

}
