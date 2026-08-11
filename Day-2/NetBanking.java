package inheritance_example;

public class NetBanking extends PaymentService{
	void payNetBanking(long custId,long mobile)
	{
		super.sendOTP(mobile);
		System.out.println("Purchased with Netbanking"+ custId);
		
	}

}
