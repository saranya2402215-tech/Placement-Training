class Employee1
{
	int empId;
	String empName;
	String empGender;
	
	Employee()
	{
		System.out.println("Object Created..");
	}
	
	Employee1(int empId,String name,String gender)
	{
		this.empId=empId;
		this.empName=name;
		this.empGender=gender;	
	}
	void getEmployee1Details() {
		System.out.println(this.empId+" "+this.empName+" "+this.empGender);
	}
}
public class constructorExample {

	public static void main(String[] args) {
		
		Employee1 e1=new Employee1(215,"san","female");
		System.out.println(e1.empId+" "+e1.empName+" "+e1.empGender);
		e1.getEmployee1Details();
		
		Employee1 e2=new Employee1();
		e2.getEmployee1Details();
	}

}
