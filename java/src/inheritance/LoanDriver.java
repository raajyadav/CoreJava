package inheritance;

public class LoanDriver {

	public static void main(String[] args) {
		CarLoan cl = new CarLoan();
		CarLoan cl2 = new CarLoan("RT34344",343489938, 12, "BMW","Up2002");
		CarLoan cl3 = new CarLoan("MT00332", 5343455, 15 , "Maruti" , "DL4030");
		
		System.out.println(cl.getCarLoanDetails());
		System.out.println(cl2.getCarLoanDetails());
		System.out.println(cl3.getCarLoanDetails());
				
	}
}
