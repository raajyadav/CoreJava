package factoryPattern;

public class Pizza implements FastFood{
	
	{
		System.out.println("Pizza is Cooked!");
	}
	
	
	/*Pizza(String msg){
		System.out.println(msg);
	}*/

	@Override
	public void printDetails() {
		System.out.println("I'm Pizza");
		
	}
	
	

}