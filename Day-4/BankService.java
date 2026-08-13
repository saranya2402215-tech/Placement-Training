package bank_app;

public class BankService 
{
	double currentBalance=350000;
	long nums[]= {10028,10045,10089,10056};
	
	void searchAccount(long accNo) throws AccountnotfoundException
	{
		boolean flag=false;
		for(long num:nums) 
		{
			if(num==accNo) 
			{
				System.out.println("Account found");
				flag=true;
				break;
			}
		}
		if(!flag)
			throw new AccountnotfoundException("Account Not Found");
	}
	void withdrawl(float amount) throws InsufficientBalance, InvalidAmountException {
		if(amount<=0)
			throw new InvalidAmountException("Amount should be > 100");
		if(amount> currentBalance)
			throw new InsufficientBalance("Insufficient Balance");
		
		currentBalance = currentBalance-amount;
	}
	void login(int cardNo,int pin) throws InvalidPinException 
	{
		if(cardNo==12345678) 
		{
			if(pin==2406) 
				System.out.println("Logged in successfully..");
			else
				throw new InvalidPinException("Incorect PIN number");
		
		}
			else
				System.out.println("Card Invalid..");
				
	}
		
}


