package inheritance_example;

public class BankServiceV2 extends BankServiceV1 {
	void updateAccountDetails()
	{
		System.out.println("Account details updated...");
	}
	void updateAadharNumber() {
		System.out.println("Aadhar Number Updated");
	}
	void applyForPersonalLoan(long accNO,float loanAmount,int tenure) {
		System.out.println("Your loan application is processing...");
	}
}
