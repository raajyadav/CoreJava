package shapeBasedProjectInheritance;

import java.util.Scanner;

public class Game {

	Game(){
		System.out.println("============Welcome to Game===============");
	}
	
	public void startGame() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 For ====> 2-D Shape ");
		System.out.println("Press 2 For ====> 3-D Shape ");
        int choice = sc.nextInt();
        if(choice == 1) {
        	System.out.println("You have Selected 2-D Shape");
        	TwoDShape t1 = selectTwoDShape();
        	t1.rotate();     
        	t1.getArea();
        	t1.getPerimeter();
        }
        else if(choice == 2) {
        	System.out.println("You have Selected 3-D Shape");
        	ThreeDShape t1 = selectThreeDShape();
        	t1.rotate();
        	t1.getVolume();
        	t1.getLSA();
        	t1.getTSA();
        }
        else
        {
        	System.out.println("This is Invalid Option");
//        	startGame();
        }
	}
//	=============================================================
        public static TwoDShape selectTwoDShape() {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Press 1 to Select ====>Circle");
        	System.out.println("Press 2 to Select ====>Rectangle");
        	System.out.println("Press 3 to Select ====>Square");
        	int choice = sc.nextInt();
        	if(choice == 1) {
        		System.out.println("You have Selected Circle");    
        		System.out.println("Enter radius");
        		double radius = sc.nextDouble();
        		Circle c1 = new Circle(radius);
        		return c1;
        	}
        	else if(choice == 2) {
        		System.out.println("You have Selected Rectangle");
        		System.out.println("Enter Length");
        		double length = sc.nextDouble();
        		System.out.println("Enter Breadth");
        		double breadth = sc.nextDouble();
        		Rectangle r1 = new Rectangle(length,breadth);
        		return r1;
        	}
        	else if(choice == 3) {
        		System.out.println("You have Selected Square");
        		System.out.println("Enter side");
        		double side = sc.nextDouble();
        		Square s1 = new Square(side);
        		return s1;
        	}
        	else
        	{
        		System.out.println("This is Invalid Choice");
        	}
        	return selectTwoDShape();
        }
//   ==================================================================
        
        public static ThreeDShape selectThreeDShape() {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Press 1 to Select ===>Cylinder");
        	System.out.println("Press 2 to Select ===>Sphere");
        	System.out.println("Press 3 to Select ===>Cone");
        	int choice = sc.nextInt();
        	if(choice == 1) {
        		System.out.println("You have Selected Cylinder");
        		System.out.println("Enter Radius");
        		double radius = sc.nextDouble();
        		System.out.println("Enter Height");
        		double height = sc.nextDouble();
        		Cylinder c1 = new Cylinder(radius,height);
        		return c1;
        	}
        	else if(choice == 2) {
        		System.out.println("You have Selected Sphere");
        		System.out.println("Enter Radius");
        		double radius = sc.nextDouble();
        		Sphere s1 = new Sphere(radius);
        		return s1;
        		
        	}
        	else if(choice == 3) {
        		System.out.println("You have Selected Cone");
        		System.out.println("Enter Radius");
        		double radius = sc.nextDouble();
        		System.out.println("Enter Height");
        		double height = sc.nextDouble();
        		System.out.println("Enter Slant Height");
        		double slant_height = sc.nextDouble();
        		Cone c1 = new Cone(radius, height, slant_height);
        		return c1;
        	}
        	else
        	{
        		System.out.println("This is Invalid Choice");
        	}
        	return selectThreeDShape();
        	
        }
	
}
