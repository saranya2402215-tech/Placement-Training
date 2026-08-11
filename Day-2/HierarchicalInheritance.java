package inheritance_example;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		CreditCardService s=new CreditCardService();
		s.PayWithCreditCard(123789,345);
		
		NetBanking s2=new NetBanking();
		s2.payNetBanking(2367,9600834497l);
	}

}
