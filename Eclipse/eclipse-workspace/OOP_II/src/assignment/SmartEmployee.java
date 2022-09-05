package assignment;
public class SmartEmployee extends MncEmployee {

    @Override
    public double getSalary(){
        double salary = super.getSalary() + 3000 ;
        return salary;
    }

    @Override
    public String getManagerName(){
        String managerNames = super.getManagerName();  //+ " and Mr. Pichhoy" ;
        managerNames = managerNames.concat( " and Mr. Pichhoy" );
        System.out.println("Manager Details: "+managerNames);
        return managerNames;
    }
        public static void main(String[] args) {
        	SmartEmployee sm=new SmartEmployee()	;
        	sm.setEmployeeName("Wazimu");
        	sm.setDepartmentNumber(500);
        	sm.setHireDate("10-10-2019");
        	sm.setManagerName("Hesbon");
        	sm.setSalary(50000);
        	sm.showDetails();
        	sm.getManagerName();
    }
    
}
