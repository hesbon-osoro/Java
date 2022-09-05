package assignment;

public class MncEmployee {
	   private String employeeName;
	   private int departmentNumber;
	   public double salary;
	   private String hireDate;
	   private String managerName;

	    public String getEmployeeName() {
	        return employeeName;
	    }

	    public void setEmployeeName(String employeeName) {
	        this.employeeName = employeeName;
	    }

	    public int getDepartmentNumber() {
	        return departmentNumber;
	    }

	    public void setDepartmentNumber(int departmentNumber) {
	        this.departmentNumber = departmentNumber;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    public String getHireDate() {
	        return hireDate;
	    }

	    public void setHireDate(String hireDate) {
	        this.hireDate = hireDate;
	    }

	    public String getManagerName() {
	        return managerName;
	    }

	    public void setManagerName(String managerName) {
	        this.managerName = managerName;
	    }
	    public void showDetails() {
	    	System.out.println("Employee Name: "+employeeName);
	    	System.out.println("Dept. ID: "+departmentNumber);
	    	System.out.println("Hire Date: "+hireDate);
	    	System.out.println("Salary: "+salary);
	    	System.out.println();
	    }
	}
