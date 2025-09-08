package lambdaExpression;

public class NumberOperationDriver {

	public static void main(String[] args) {
		
		NumberOperation isEven = x ->{
			if(x%2==0)
				System.out.println(x+" is Even");
			else
				System.out.println(x+" is Odd");
		};
		
		NumberOperation factorial = (int n) ->{
			int fact=1;
			for(int i=1;i<=n;i++)
				fact=fact*i;
		         System.out.println(n+"!= "+fact);
		 };
		
		isEven.operate(22);
		isEven.operate(23);
		factorial.operate(4);
		factorial.operate(6);
	}
}
