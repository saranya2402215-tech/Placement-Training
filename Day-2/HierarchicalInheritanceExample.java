package inheritance;
class Head{
	String headOfice="ABC str,SREC nagar,Delhi";
	
	void display() {
		System.out.println("Hello");
	}
}
class ChennaiOfc extends Head
{
	
}
void chennaiOfcReport() {
	System.out.println("Head Office Location:"+super.headOffice);
	System.out.println("Today Chennai Report");
}
public class HierarchicalInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
