package streamAPIPrograms;

public class VehicleDriver {
	
	public static void main(String[] args) {
		Vehicle v1 = (n) ->System.out.println("n is: "+n);
		v1.drive(6);
		
		Vehicle v2 ;
		v2 = (n) ->System.out.println("2n is: "+2*n);
		v2.drive(6);
	}

}
