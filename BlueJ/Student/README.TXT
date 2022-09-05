/**
*The Student classs keeps track of the following pieces of data 
*about a student: the student's name, ID number, the number of 
*credits the student has earned toward graduation and whether
*
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
public void setCredits(double credits){
    creditEarned=credits;