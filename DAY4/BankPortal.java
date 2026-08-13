package bank_app;
import java.util.Scanner;

public class BankPortal {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		BankService service=new BankService();
		System.out.println("-----Bank Portal-----");
		System.out.println("1.Search Account 2.Cash Withdraw 3.Login");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Type ur acc No");
			int accNo=sc.nextInt();
			try {
				service.searchAccount(accNo);
			} catch (AccountnotfoundException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			System.out.println("Type ur amt");
			float amnt=sc.nextFloat();
			try 
			{
				service.withdrawl(amnt);
			} 
			catch (InsufficientBalance | InvalidAmountException e) 
			{
				System.out.println(e.getMessage());				
			}
			break;
		}
		case 3;
			
	}
}
