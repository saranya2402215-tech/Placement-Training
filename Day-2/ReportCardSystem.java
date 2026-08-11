package encapsulation;

public class ReportCardSystem {

	public static void main(String[] args) {
		ReportCard s1=new ReportCard(100,"san",90,60,50,28);
		s1.setRollno(215);
		s1.setName("san");
		s1.setM1(90);
		s1.setM2(80);
		s1.setM3(70);
		s1.setM3(65);
		s1.setM4(39);
		s1.calculations();
		s1.getReportCard();

	}

}
