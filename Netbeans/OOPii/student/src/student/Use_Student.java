
package student;

public class Use_Student {

    public static void main(String[] args) {
        Student chosenOne=new Student("Harry Potter",123456);
        Student topStudent=new Student("Wazimu hb", 987456);
        topStudent.setCredits(97);
        chosenOne.getName();
        chosenOne.toString();
        topStudent.setPaidUp(true);
        topStudent.setCredits(54.0);
        topStudent.getCredits();
        topStudent.getName();
        topStudent.toString();
    }
    
}
