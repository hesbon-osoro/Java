package arrays;

public class Employee { 
	Employee[] someEmps = new Employee[5];
	private int empNum; 
	private String lastName;
	private String firstName;
	private double salary;
	public int getEmpNum() { 
		return empNum;
		}
	public void setEmpNum(int emp) { 
		empNum = emp; 
		}
	public String getLastName() {
		return lastName; 
		}
	public void setLastName(String name) { 
		lastName = name; 
		}
	public String getFirstName() { 
		return firstName;
		}
	public void setFirstName(String name) { 
		firstName = name;
		}
	public double getSalary() {
		return salary; 
		}
	public void setSalary(double sal) {
		salary = sal;
		}
	public static void bubbleSort(Employee[] array) { 
		int a, b;
		Employee temp;
		int highSubscript = array.length - 1;
		for(a = 0; a < highSubscript; ++a)
			for(b = 0; b < highSubscript; ++b) 
				if(array[b].getSalary() > array[b + 1].getSalary()) { 
					temp = array[b];
					array[b] = array[b + 1];
					array[b + 1] = temp; 
					}
		}
	}