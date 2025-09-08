package shapeBasedProjectInheritance;

public class Rectangle extends TwoDShape {
	
	double l;
	double b;
	
	Rectangle(){
		
	}
	Rectangle(double l,double b){
		this.l=l;
		this.b=b;
	}
	@Override
	public void getArea() {
		System.out.println("Area of Rectangle is: "+l*b+" Sq. Unit");
	}
	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of Rectangle is: "+2*(l+b)+" Unit");
	}

}
