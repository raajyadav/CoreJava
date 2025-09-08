package shapeBasedProjectInheritance;

public class Circle extends TwoDShape {
	double r;
	
	Circle(){
		
	}
	Circle(double r){
		this.r=r;
	}
	
	@Override
	public void getArea() {
		System.out.println("Area of Circle is: "+Math.PI*r*r+" Sq. Unit");
	}
	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of Circle is: "+2*Math.PI*r+" Unit");
		
	}

}
