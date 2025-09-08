package inheritance;

public class CarLoan extends Loan {

	String name;
	String car_no;
	
	CarLoan(){
		
	}
	CarLoan(String loan_num, double amount , double roi, String name, String car_no){
		super(loan_num,amount ,roi);
		this.name=name;
		this.car_no=car_no;
	}
	
	public String getCarLoanDetails() {
		return super.getLoanDetails()+"Name is : "+name+"\nCar Number is : "+car_no+"\n===========================================";
	}
}
