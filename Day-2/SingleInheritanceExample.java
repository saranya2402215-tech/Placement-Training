package inheritance_example;
public class SingleInheritanceExample {
	public static void main(String[] args) {
		BankServiceV1 service = new BankServiceV1();
		service.deposit(10001, 120);
		service.withdraw(1002, 340);
		BankServiceV2 service1 = new BankServiceV2();
		service1.updateAadharNumber();
		service1.updateAccountDetails();
		service1.applyForPersonalLoan(123,345678,15);
	}
}
