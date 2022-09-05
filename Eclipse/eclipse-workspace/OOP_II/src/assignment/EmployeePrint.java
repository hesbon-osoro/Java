package assignment;

public class EmployeePrint {

	public static void main(String[] args) {
	       Employee highpaid=new Employee("Wazimu",1001);
	       Employee avgpaid=new Employee("hbw",1002);
	       Employee lowpaid=new Employee("Mshamba",1003);
	       highpaid.setSalary(100000.75);
	       avgpaid.setSalary(50000.05);
	       lowpaid.setSalary(100.25);
	       highpaid.setActive(true);
	       avgpaid.setActive(true);
	       lowpaid.setActive(false);
	       highpaid.printDet();
	       avgpaid.printDet();
	       lowpaid.printDet();
	}

}
