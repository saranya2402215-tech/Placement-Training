class Student
{
	int rollno;
	String name;
	int age;
	String gender;
	void setValues(int rollno,String name,int age,String gender)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
}
public class SchoolSystem {
	public static void main(String[] args) {
		Student s1=new Student();
//		s1.rollno=215;
//		s1.name="san";
//		s1.age=19;
//		s1.gender="female";
		s1.setValues(215, "san", 19, "female");
		System.out.println(s1.name+"\n"+s1.rollno+"\n"+s1.age+"\n"+s1.gender);
	}

}
