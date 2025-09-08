package factoryPattern;

public class NoSuchItemFoundException extends Exception{
	
	public NoSuchItemFoundException() {
		
	}
	
	NoSuchItemFoundException(String msg){
		super(msg);
	}

}
