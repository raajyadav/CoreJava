package exceptionHandling;

public class Program10 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=10;i++) {
			System.out.println("i is: "+i);
			try {
			Thread.sleep(800);
			}catch(Exception e) {
				System.out.println("Hey Thread! Im pissed off");
				System.out.println("You have Interrupted me");
			}
		}
		System.out.println("Program Ends");
	}

}