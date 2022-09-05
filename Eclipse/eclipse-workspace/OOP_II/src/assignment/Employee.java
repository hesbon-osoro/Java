/*
 * Employee Track 
 */
package assignment;
/**
*The Employee class keeps track of the following information
*about the employee; Employee's Name, Number indicating 
* order in which the employee was hired, a flag indicating 
* whether the employee is still active and the Salary (a number
* that may contain decimal fraction).
*/
public class Employee {
/**
*Creates a new Employee object that will store name and Order id
*@param name The Employee Name of type String
*@param order_Id The employee order of hiring of type Int
*/
public Employee(String name, int order_Id){
	empName=name;
	empID=order_Id;
}
/**
*Gets the name of the Employee
*@return the name of the employee
*/
public String getName(){
	return empName;
}
/**
*Gets the Id for the order of employee being hired
*@return The Order ID of the employee
*/
public int getOrderID(){
	return empID;
}
/**
* Sets a flag indicating whether employee is still active
* @param flag value is true if employee is active and false otherwise.
*/
public void setActive(boolean flag){
	active=flag;
}
/**
* Returns the value true or false depending on whether the employee is
* active or not.
* @return Whether employee is active
*/
public boolean isActive(){
	return active;
}
/**
* Sets the employees salary of type double
* @param salary The employees salary
*/
public void setSalary(double salary){
	empSalary=salary;
}
/**
* Gets the employees salary value
* @return The Salary of the employee
*/
public double getSalary(){
	return empSalary;
}
/** Prints the String output on the screen*/
public void printDet(){
	System.out.println("***************");
	System.out.println("Emp ID: "+empID);
	System.out.println("Name: "+empName);
	System.out.println("Status: "+active);
	System.out.println("Salary: "+empSalary);
	System.out.println("***************");
}
/**private instance variables*/
private String empName;		/* Employee's Name*/
private int empID;			/* Employee's order Id*/
private boolean active;		/* Employee's activity status*/
private double empSalary;	/* Employee's Salary*/
	
}
