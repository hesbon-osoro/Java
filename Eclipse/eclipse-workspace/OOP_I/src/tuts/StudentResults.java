package tuts;

public class StudentResults {
	private String Full_name;
	private String Exam_name;
	private String Exam_Score;
	private String Exam_Grade;
	StudentResults(){
		Full_name="Wazimu HB";
		Exam_name="Java oop";
		Exam_Score="90";
		Exam_Grade="A";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentResults r=new StudentResults();

System.out.println(r.Full_name);
System.out.println(r.Exam_name);
System.out.println(r.Exam_Score);
System.out.println(r.Exam_Grade);
	}
}
