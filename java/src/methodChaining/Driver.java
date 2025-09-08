package methodChaining;

public class Driver {
   
	public static void main(String[] args) {
		
		Employee e1=new Employee("Mohan", "mohan123", 24325.5, 24);
		Employee e2=new Employee("Sohan", "sohan123", 20325.5, 23);
		Employee e3=new Employee("Rohan", "rohan123", 28325.5, 26);
		Employee e4=new Employee("John", "john123", 26325.5, 22);
		
		e1.getName().getId().getSalary();
		System.out.println("====================");
		e2.getName().getId();
		System.out.println("=======================");
		e3.getName().getSalary();
		System.out.println("=======================");
		e1.getName().getId().getSalary().getAge();
	}
}
