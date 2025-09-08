package lambdaExpression;

public class VehicleDriver {
	
	public static void main(String[] args) {
		Vehicle car = () ->{ System.out.println("Drive car");    };
		Vehicle bike = () ->{ System.out.println("Drive Bike");  };
		Vehicle bus = () ->{ System.out.println("Drive Bus");    };
		
		Vehicle train = () -> {
			System.out.println("I am Train");
			System.out.println("i am Now Starting");
			System.out.println("Now Drive me");
		};
		
		car.drive();	
		bike.drive();
		bus.drive();
		train.drive();		
	}
	
	
	
	

}
