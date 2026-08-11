package encapsulation;

public class ReportCard 
{
	private int rollno;
	private String name;
	private int m1;
    private	int m2;
	private int m3;
	private int m4;
	private int m5;
	private int total;
	private float avg;
	private String grade;
	
	public ReportCard(int i, String string, int j, int k, int l, int m) {
		// TODO Auto-generated constructor stub
	}
	public void setRollno(int rollno) {
		System.out.println("type ur ID");
		
		this.rollno=rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public int getM4() {
		return m4;
	}
	public void setM4(int m4) {
		this.m4 = m4;
	}
	public int getM5() {
		return m5;
	}
	public void setM5(int m5) {
		this.m5 = m5;
	}
	public int getTotal() {
		return total;
	}
	
	public float getAvg() {
		return avg;
	}

	public String getGrade() {
		return grade;
	}
	
	public int getRollno() {
		return rollno;
	}
	public int gerRollno() {
		return this.rollno;
	}
	public void calculations() {
		// TODO Auto-generated method stub
		
	}
	public void getReportCard() {
		// TODO Auto-generated method stub
		
	}
}
