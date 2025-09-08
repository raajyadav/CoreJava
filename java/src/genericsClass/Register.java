package genericsClass;

public class Register <T,U > {

	 T t;
	 U u;
	 
	 public Register(T t, U u) {
		 this.t=t;
		 this.u=u;
	 }
	 public void getValues() {
		  
		 System.out.println("Keys is: "+t+" , Values is: "+u);
	 }
}
