/**
*The Student classs keeps track of the following pieces of data 
*about a student: the student's name, ID number, the number of 
*credits the student has earned towards graduation, and whether 
*the student is paid up with respect to university bills.
*All of this information is entirely private to the class.
*Client s can obtain this information only using the various
*methods defined by the class.
*/
public class Student{
/**
*creates a new Student object with the specified name and ID.
*@param name The Student's name as a String
*@param id The Student's ID number as an int
*/
    public Student(String name,int id){
        studentName=name;
        studentID=id;
    }

/**
*Gets the name of this student.
*@return The name of this student
*/
/**
*These methods retrieves the value of an instance 
*variable and are called getters. Because the 
*student name and ID number are fixed, there are 
*no corresponding setters
*/
public String getName(){
    return studentName;
}
/**
*Gets the ID number of this student.
*@return the ID number of this student
*/
public int getID(){
    return studentID;
}
/**
*Sets the number of credits earned.
*@param credits The new number of credits earned
*/
/**
*This method changes the value of an instance variable
*/
public void setCredits(double credits){
    creditsEarned=credits;
}
public double getCredits(){
    return creditsEarned;
}
/**
*Sets whether the student is paid up.
*@param flag The value true or false indicating paid-up status
*/
public void setPaidUp(boolean flag){
    paidUp=flag;
}
/**
*Returns whether the student is paid up.
*@return whether the student is paid up
*/
/**
 * Names for getter methods usually begin with the prefix get.
 * The only exception is...
 */
public boolean isPaidUp(){
    return paidUp;
}
/**
 * Creates a string identifying this student.
 * @return The string used to display this student.
*/
public String toString(){
	System.out.println("Student ID: "+studentID);
	System.out.println("Student Name: "+studentName);
	System.out.println("Paid Up: "+paidUp);
    return studentName+"(#"+studentID+")";
}
/*public constants*/
/**
 * The number of credits required for graduation
 */
public static final double CREDITS_TO_GRADUATE=32.0;
/*Private instance variables*/

private String studentName; /*The student's name*/
private int studentID;      /*The student's ID number*/
private double creditsEarned;   /*The number of credits earned*/
private boolean paidUp;     /*Whether student is paid up*/
}
