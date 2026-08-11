package inheritance;

class Parent{
	int a,b;

	void display() {
		System.out.println("Hello from Parent class");
	}
}
class Child extends Parent
{
	void calc() {
		super.a=10;
		super.b=20;
		int c=super.a+super.b;
		System.out.println("Addition: "+c);
		super.display();
	}
	
	
	
}
public class inheritanceExample {

	public static void main(String[] args) {
		Child obj=new Child();
		obj.calc();
		obj.display();

	}

}
