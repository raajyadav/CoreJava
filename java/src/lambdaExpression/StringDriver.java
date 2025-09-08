package lambdaExpression;

public class StringDriver {

	public static void main(String[] args) {
		 
		StringOp len = 	str ->	str.length();
		
		StringOp space = (String str) ->{
			int count = 0;
			for(int i=0;i<str.length();i++) {
				char c=str.charAt(i);
				if(c==' ')
					count++;
			}
			return count;
		};
	   	
	   System.out.println(len.get("Mohan is a good boy"))	;
	   System.out.println(space.get("Ram is very Innocent"));
	}
}
