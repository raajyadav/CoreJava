package exceptionHandlingCustomizedUnCheckedException;

public class UnderAgeException extends RuntimeException{

	UnderAgeException(){
		super("you cannot vote");
	}
	UnderAgeException(String msg){
		super(msg);
	}
}
