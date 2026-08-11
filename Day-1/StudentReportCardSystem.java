class StudentReportCard
{
	int rollno;
	String name;
	int m1;
	int m2;
	int m3;
	int m4;
	int m5;
	int total;
	float avg;
	String grade;
	
	StudentReportCard(int rollno,String name,int m1,int m2,int m3,int m4,int m5)
	{
		this.rollno=rollno;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
		this.calculations();
	}
	void calculations()
	{
		total=m1+m2+m3+m4+m5;
		avg=total/5;
		if(avg>90)
			grade="O";
		else if(avg>80)
			grade="A+";
		else if(avg>70)
			grade="A";
		else if(avg>60)
			grade="B+";
		else if(avg>50)
			grade="B";
		else if(avg>=40)
			grade="C";
		else
			grade="U";
	}
	void getReportCard() {
		System.out.println(this.rollno+" "+this.m1+" "+this.m2+" "+this.m3+" "+this.m4+" "+this.m5+" "+this.total+" "+this.avg+" "+this.grade);
	}
}
public class StudentReportCardSystem {
	public static void main(String[] args) {
		StudentReportCard s1=new StudentReportCard(215,"san",90,80,70,60,50);
		s1.grade="O";
		s1.getReportCard();
	}
}
