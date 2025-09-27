package multiThreadingDeadLockProgram2;

public class User extends Thread{

	String name;
	String r1;
	String r2;

	User(String name, String r1, String r2) {
		this.name = name;
		this.r1 = r1;
		this.r2 = r2;
	}

	public void run() {
		synchronized (r1) {
			System.out.println(name + " has taken " + r1);
			System.out.println(name + " is now waiting for " + r2);
			synchronized (r2) {
				System.out.println(name + " has got " + r2);
			}
			System.out.println(name + " has completed execution!!");
		}
	}
}
