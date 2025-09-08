package multiThreading;

public class UserDriver {
	
	public static void main(String[] args) {
		User u1 = new User("Mohan"); //Runnable Object
		User u2 = new User("Sohan");
		User u3 = new User("Raj");
		User u4 = new User("Roshan");
		
		Thread t1 = new Thread(u1);
		Thread t2 = new Thread(u2);
		Thread t3 = new Thread(u3);
		Thread t4= new Thread(u4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}

}
