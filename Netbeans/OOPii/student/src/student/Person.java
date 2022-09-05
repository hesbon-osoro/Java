/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package student;

/**
 *
 * @author HB
 */
 class Person {
    private String name;//instance variable
    public Person()
    {
    name="No Name Yet";
    }
    public Person(String initialName)
    {
    name=initialName;
    }
    public String getName()
    {
    return name;
    }
    public void setName(String noName)
    {
    name=noName;
    }
    public void writeOutput()
    {
    System.out.println("Name: "+name);
    }
    public boolean hasSameName(Person otherPerson)
    {
    return this.name=ignoreCase(otherPerson.name);
    }
}
public class Student extends Person
{
    private int studentNumber;
    public Student()
    {
    super();
    studentNumber=0;
    }
    public void reset(String newName, int newStudentNumber)
    {
    setName(newName);
    studentNumber=newStudentNumber;
    }
    public int getStudentNumber()
    {
    return studentNumber;
    }
    public void setStudentNumber(int newStudentNumber)
    {
    studentNumber=newStudentNumber;
    }
    public void writeOutput()
    {
    System.out.println("Name: "+name);
    System.out.println("Student Number: "+studentNumber);
    }
    public boolean equals(Student otherName)
    {
    return this.hasSameName(otherStudent)&&(this.studentNumber==otherStudent.studentNumber);
    }    
}
