package genericsClass;

public class Box<T> {

	  T t;
	  
	  Box(T t){
		  this.t=t;
	  }
	  
	  public void printValue() {
		  System.out.println("Value is: "+t);
	  }
	
}
