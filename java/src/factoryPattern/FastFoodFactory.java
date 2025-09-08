package factoryPattern;

public class FastFoodFactory {

	public FastFood takeRequestAndGive(String req) throws NoSuchItemFoundException{
		
		switch(req.toLowerCase()) {
		   case"pizza":
			   System.out.println("Pizza is ready");
			   return new Pizza();
		   case"burger":
			   System.out.println("Burger is ready");
			   return new Burger();
		   case"coke":
			   System.out.println("Coke is ready");
			   return new Coke();
		   case"dessert":
			   System.out.println("Desser is ready");
			   return new Dessert();
		   default:
			   throw new NoSuchItemFoundException(req+" is currently Unavailable ");
		   
		}
	}
}
