package shapeBasedProjectInheritance;

public class Square extends TwoDShape{
	
	double a;
	
	Square(){
		
	}
	Square(double a){
		this.a=a;
	}
	@Override
	public void getArea() {
		System.out.println("Area of Square is: "+a*a+" Sq. Unit");
	}
	
	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of Square is: "+4*a+" Unit");
	}

}
