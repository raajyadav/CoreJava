package finalMethod;

public class Car extends Vehicle{

	 public void drive() {
		 System.out.println("Drive Car");
	 }
}
//Note:- Error,final method cannot be overriden ,here Car class try to override drive method which is in Vehicle class and its is final so Car class cannot override 