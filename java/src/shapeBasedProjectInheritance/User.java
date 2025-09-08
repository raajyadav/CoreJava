package shapeBasedProjectInheritance;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game g = new Game();
//		g.startGame();
		char c;
		
		do {
			g.startGame();
			System.out.println("Press Y/y to restart");
			c=sc.next().charAt(0);
			
		}while(c =='Y' 	|| c == 'y');
		System.out.println("Thank You for Playing Game");
	}
}
