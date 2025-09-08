package payRollSystemProject;

public class Driver {

	public static void main(String[] args) {
		PayrollSystem payrollSystems = new PayrollSystem();
		FullTimeEmployee emp1 = new FullTimeEmployee("Bikash",1,12000);
		PartTimeEmployee emp2 = new PartTimeEmployee("Raju",2,4,100.0);
		
	  payrollSystems.addEmployee(emp1);
	  payrollSystems.addEmployee(emp2);
	  
	  System.out.println("Initial Employee Details:");
	  System.out.println("==============");
       payrollSystems.dispayEmployees();
       System.out.println("=========================================");
       System.out.println("Removing Employee");
       System.out.println("===================");
       payrollSystems.removeEmployee(2);
       System.out.println("Remaining Employee Details: ");
       payrollSystems.dispayEmployees();
       
	}
}
