package exceptionHandlingCustomizedCheckedException;

public class UnderAgeException extends Exception{

	UnderAgeException(){
		super("You cannot vote");
	}
	UnderAgeException(String msg){
		super(msg);
	}
}
