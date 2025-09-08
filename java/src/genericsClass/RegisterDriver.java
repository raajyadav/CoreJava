package genericsClass;

public class RegisterDriver {
	
	public static void main(String[] args) {
		Register<Integer, String> r1 = new Register<>(23,"Raj");
		Register<String, String> r2 = new Register<>("TATA", "UP344BR");
		
		r1.getValues();
		r2.getValues();
	}

}
